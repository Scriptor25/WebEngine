package io.scriptor.dom;

import imgui.ImGui;
import io.scriptor.Tab;

public class HTMLH4Element extends HTMLElement {

    public HTMLH4Element() {
        super("h4");
    }

    @Override
    public void draw(Tab tab) {
        ImGui.setWindowFontScale(1.25f);
        super.draw(tab);
        ImGui.setWindowFontScale(1.0f);
    }
}
