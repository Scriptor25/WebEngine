package io.scriptor.dom;

public class HTMLHeadElement extends HTMLElement {

    public HTMLHeadElement() {
        super("head");
    }

    public String profile() {
        return attr("profile");
    }

    public HTMLHeadElement profile(String profile) {
        attr("profile", profile);
        return this;
    }
}
