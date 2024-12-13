package io.scriptor.dom;

public class HTMLFormElement extends HTMLElement {

    public HTMLFormElement() {
        super("form");
    }

    public String acceptCharset() {
        return attr("accept-charset");
    }

    public HTMLFormElement acceptCharset(String value) {
        attr("accept-charset", value);
        return this;
    }

    public String autocomplete() {
        return attr("autocomplete");
    }

    public HTMLFormElement autocomplete(String value) {
        attr("autocomplete", value);
        return this;
    }

    public String name() {
        return attr("name");
    }

    public HTMLFormElement name(String value) {
        attr("name", value);
        return this;
    }

    public String rel() {
        return attr("rel");
    }

    public HTMLFormElement rel(String value) {
        attr("rel", value);
        return this;
    }

    public String action() {
        return attr("action");
    }

    public HTMLFormElement action(String value) {
        attr("action", value);
        return this;
    }

    public String enctype() {
        return attr("enctype");
    }

    public HTMLFormElement enctype(String value) {
        attr("enctype", value);
        return this;
    }

    public String method() {
        return attr("method");
    }

    public HTMLFormElement method(String value) {
        attr("method", value);
        return this;
    }

    public String novalidate() {
        return attr("novalidate");
    }

    public HTMLFormElement novalidate(String value) {
        attr("novalidate", value);
        return this;
    }

    public String target() {
        return attr("target");
    }

    public HTMLFormElement target(String value) {
        attr("target", value);
        return this;
    }
}
