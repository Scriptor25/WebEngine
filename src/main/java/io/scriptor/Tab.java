package io.scriptor;

import imgui.ImGui;
import imgui.flag.ImGuiCond;
import imgui.flag.ImGuiInputTextFlags;
import imgui.flag.ImGuiWindowFlags;
import imgui.type.ImBoolean;
import imgui.type.ImString;
import io.scriptor.dom.Document;
import org.jsoup.Jsoup;

import java.net.URI;
import java.util.UUID;

import static io.scriptor.Error.handle;
import static io.scriptor.Error.handleVoid;

public class Tab {

    private final UUID uuid = UUID.randomUUID();
    private final ImString url = new ImString();
    private Document document;

    private URI documentURI;

    public Tab() {
    }

    public Tab(String url) {
        load(url);
    }

    public void load(String urlStr) {
        final var rawURI = URI.create(urlStr);
        final URI uri;
        if (documentURI != null)
            uri = documentURI.resolve(rawURI);
        else uri = rawURI;

        this.url.set(uri.toString(), true);
        this.document = null;
        this.documentURI = uri;

        new Thread(() -> {
            final var con = handle(() -> documentURI.toURL().openConnection());
            final var stream = handle(con::getInputStream);
            final var jsoup = handle(() -> Jsoup.parse(stream, "UTF-8", documentURI.toString()));
            handleVoid(stream::close);
            this.document = Document.from(jsoup);
        }).start();
    }

    public void draw(int dockspace, ImBoolean open) {
        final var label = document == null ? "New Tab" : document.title();
        final var id = label + "###" + uuid;
        final var flags = ImGuiWindowFlags.HorizontalScrollbar | ImGuiWindowFlags.NoSavedSettings;
        ImGui.setNextWindowDockID(dockspace, ImGuiCond.FirstUseEver);
        if (ImGui.begin(id, open, flags)) {
            if (ImGui.button("Reload"))
                load(documentURI.toString());
            ImGui.sameLine();
            if (ImGui.inputText("URL", url, ImGuiInputTextFlags.EnterReturnsTrue))
                load(url.get());
            if (document != null) {
                if (ImGui.beginChild("content", flags))
                    document.rootNode().draw(this);
                ImGui.endChild();
            }
        }
        ImGui.end();
    }
}
