package io.scriptor.dom;

import imgui.ImGui;
import io.scriptor.Tab;

public class HTMLH2Element extends HTMLElement {

    public HTMLH2Element() {
        super("h2");
    }

    @Override
    public void draw(Tab tab) {
        ImGui.setWindowFontScale(1.75f);
        super.draw(tab);
        ImGui.setWindowFontScale(1.0f);
    }
}
