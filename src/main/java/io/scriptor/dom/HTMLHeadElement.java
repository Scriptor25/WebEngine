package io.scriptor.dom;

import io.scriptor.Tab;

public class HTMLHeadElement extends HTMLElement {

    public HTMLHeadElement() {
        super("head");
    }

    @Override
    public void draw(Tab tab) {
    }

    public String profile() {
        return attr("profile");
    }

    public HTMLHeadElement profile(String profile) {
        attr("profile", profile);
        return this;
    }
}
