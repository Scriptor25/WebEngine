package io.scriptor.dom;

import imgui.ImGui;
import io.scriptor.Tab;

public class HTMLH3Element extends HTMLElement {

    public HTMLH3Element() {
        super("h3");
    }

    @Override
    public void draw(Tab tab) {
        ImGui.setWindowFontScale(1.5f);
        super.draw(tab);
        ImGui.setWindowFontScale(1.0f);
    }
}
