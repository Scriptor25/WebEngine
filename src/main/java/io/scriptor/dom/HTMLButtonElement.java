package io.scriptor.dom;

public class HTMLButtonElement extends HTMLElement {

    public HTMLButtonElement() {
        super("button");
    }

    public String disabled() {
        return attr("disabled");
    }

    public HTMLButtonElement disabled(String value) {
        attr("disabled", value);
        return this;
    }

    public String form() {
        return attr("form");
    }

    public HTMLButtonElement form(String value) {
        attr("form", value);
        return this;
    }

    public String formaction() {
        return attr("formaction");
    }

    public HTMLButtonElement formaction(String value) {
        attr("formaction", value);
        return this;
    }

    public String formenctype() {
        return attr("formenctype");
    }

    public HTMLButtonElement formenctype(String value) {
        attr("formenctype", value);
        return this;
    }

    public String formmethod() {
        return attr("formmethod");
    }

    public HTMLButtonElement formmethod(String value) {
        attr("formmethod", value);
        return this;
    }

    public String formnovalidate() {
        return attr("formnovalidate");
    }

    public HTMLButtonElement formnovalidate(String value) {
        attr("formnovalidate", value);
        return this;
    }

    public String formtarget() {
        return attr("formtarget");
    }

    public HTMLButtonElement formtarget(String value) {
        attr("formtarget", value);
        return this;
    }

    public String name() {
        return attr("name");
    }

    public HTMLButtonElement name(String value) {
        attr("name", value);
        return this;
    }

    public String popovertarget() {
        return attr("popovertarget");
    }

    public HTMLButtonElement popovertarget(String value) {
        attr("popovertarget", value);
        return this;
    }

    public String popovertargetaction() {
        return attr("popovertargetaction");
    }

    public HTMLButtonElement popovertargetaction(String value) {
        attr("popovertargetaction", value);
        return this;
    }

    public String type() {
        return attr("type");
    }

    public HTMLButtonElement type(String value) {
        attr("type", value);
        return this;
    }

    public String value() {
        return attr("value");
    }

    public HTMLButtonElement value(String value) {
        attr("value", value);
        return this;
    }
}
