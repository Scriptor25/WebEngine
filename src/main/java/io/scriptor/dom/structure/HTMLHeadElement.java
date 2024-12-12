package io.scriptor.dom.structure;

import io.scriptor.dom.HTMLElement;

public class HTMLHeadElement extends HTMLElement {

    public String profile() {
        return attr("profile");
    }

    public HTMLHeadElement profile(String profile) {
        attr("profile", profile);
        return this;
    }
}
