package io.scriptor;

import imgui.ImGui;
import imgui.flag.ImGuiInputTextFlags;
import imgui.type.ImBoolean;
import imgui.type.ImString;
import io.scriptor.dom.Document;
import org.jsoup.Jsoup;

import java.util.UUID;

import static io.scriptor.Error.handle;

public class Tab {

    private final UUID uuid = UUID.randomUUID();
    private final ImString url = new ImString();
    private Document dom;

    public Tab() {
    }

    public Tab(String url) {
        load(url);
    }

    public void load(String url) {
        dom = null;
        new Thread(() -> {
            final var jsoup = handle(Jsoup.connect(url)::get);
            dom = Document.from(jsoup);
        }).start();
    }

    public void draw(ImBoolean open) {
        final var label = dom == null ? "New Tab" : "<title>";
        if (ImGui.begin(label + "##" + uuid, open)) {
            if (ImGui.inputText("URL", url, ImGuiInputTextFlags.EnterReturnsTrue))
                load(url.get());
        }
        ImGui.end();
    }
}
