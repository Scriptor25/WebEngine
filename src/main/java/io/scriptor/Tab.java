package io.scriptor;

import imgui.ImGui;
import imgui.flag.ImGuiInputTextFlags;
import imgui.flag.ImGuiWindowFlags;
import imgui.type.ImBoolean;
import imgui.type.ImString;
import io.scriptor.dom.Document;
import org.jsoup.Jsoup;

import java.util.UUID;

import static io.scriptor.Error.handle;

public class Tab {

    private final UUID uuid = UUID.randomUUID();
    private final ImString url = new ImString();
    private Document document;

    public Tab() {
    }

    public Tab(String url) {
        load(url);
    }

    public void load(String url) {
        this.url.set(url, true);
        this.document = null;
        new Thread(() -> {
            final var jsoup = handle(Jsoup.connect(url)::get);
            this.document = Document.from(jsoup);
        }).start();
    }

    public void draw(ImBoolean open) {
        final var label = document == null ? "New Tab" : document.title();
        if (ImGui.begin(label + "###" + uuid, open, ImGuiWindowFlags.HorizontalScrollbar | ImGuiWindowFlags.NoSavedSettings)) {
            if (ImGui.inputText("URL", url, ImGuiInputTextFlags.EnterReturnsTrue))
                load(url.get());

        }
        ImGui.end();
    }
}
