package io.scriptor.dom;

public class HTMLStyleElement extends HTMLElement {

    public HTMLStyleElement() {
        super("style");
    }

    public String blocking() {
        return attr("blocking");
    }

    public HTMLStyleElement blocking(String value) {
        attr("blocking", value);
        return this;
    }

    public String media() {
        return attr("media");
    }

    public HTMLStyleElement media(String value) {
        attr("media", value);
        return this;
    }
}
