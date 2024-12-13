package io.scriptor.dom;

public class HTMLDialogElement extends HTMLElement {

    public HTMLDialogElement() {
        super("dialog");
    }

    public String open() {
        return attr("open");
    }

    public HTMLDialogElement open(String value) {
        attr("open", value);
        return this;
    }
}
