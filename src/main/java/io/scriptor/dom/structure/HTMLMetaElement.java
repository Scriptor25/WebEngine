package io.scriptor.dom.structure;

import io.scriptor.dom.HTMLElement;

public class HTMLMetaElement extends HTMLElement {

    public String charset() {
        return attr("charset");
    }

    public HTMLMetaElement charset(String value) {
        attr("charset", value);
        return this;
    }

    public String content() {
        return attr("content");
    }

    public HTMLMetaElement content(String value) {
        attr("content", value);
        return this;
    }

    public String httpEquiv() {
        return attr("http-equiv");
    }

    public HTMLMetaElement httpEquiv(String value) {
        attr("http-equiv", value);
        return this;
    }

    public String media() {
        return attr("media");
    }

    public HTMLMetaElement media(String value) {
        attr("media", value);
        return this;
    }

    public String name() {
        return attr("name");
    }

    public HTMLMetaElement name(String value) {
        attr("name", value);
        return this;
    }
}
