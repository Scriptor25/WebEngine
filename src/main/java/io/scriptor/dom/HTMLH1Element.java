package io.scriptor.dom;

import imgui.ImGui;
import io.scriptor.Tab;

public class HTMLH1Element extends HTMLElement {

    public HTMLH1Element() {
        super("h1");
    }

    @Override
    public void draw(Tab tab) {
        ImGui.setWindowFontScale(2.0f);
        super.draw(tab);
        ImGui.setWindowFontScale(1.0f);
    }
}
