package io.scriptor.dom;

import imgui.ImGui;
import io.scriptor.Tab;

public class HTMLH6Element extends HTMLElement {

    public HTMLH6Element() {
        super("h6");
    }

    @Override
    public void draw(Tab tab) {
        ImGui.setWindowFontScale(0.75f);
        super.draw(tab);
        ImGui.setWindowFontScale(1.0f);
    }
}
