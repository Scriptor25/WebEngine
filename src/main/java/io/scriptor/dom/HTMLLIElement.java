package io.scriptor.dom;

public class HTMLLIElement extends HTMLElement {

    public HTMLLIElement() {
        super("li");
    }

    public String value() {
        return attr("value");
    }

    public HTMLLIElement value(String value) {
        attr("value", value);
        return this;
    }
}
