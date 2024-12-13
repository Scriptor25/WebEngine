package io.scriptor.dom;

import imgui.ImGui;
import io.scriptor.Tab;

public class HTMLH5Element extends HTMLElement {

    public HTMLH5Element() {
        super("h5");
    }

    @Override
    public void draw(Tab tab) {
        ImGui.setWindowFontScale(1.0f);
        super.draw(tab);
        ImGui.setWindowFontScale(1.0f);
    }
}
