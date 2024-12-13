package io.scriptor.dom;

public class HTMLTextAreaElement extends HTMLElement {

    public HTMLTextAreaElement() {
        super("textarea");
    }

    public String autocomplete() {
        return attr("autocomplete");
    }

    public HTMLTextAreaElement autocomplete(String value) {
        attr("autocomplete", value);
        return this;
    }

    public String cols() {
        return attr("cols");
    }

    public HTMLTextAreaElement cols(String value) {
        attr("cols", value);
        return this;
    }

    public String dirname() {
        return attr("dirname");
    }

    public HTMLTextAreaElement dirname(String value) {
        attr("dirname", value);
        return this;
    }

    public String disabled() {
        return attr("disabled");
    }

    public HTMLTextAreaElement disabled(String value) {
        attr("disabled", value);
        return this;
    }

    public String form() {
        return attr("form");
    }

    public HTMLTextAreaElement form(String value) {
        attr("form", value);
        return this;
    }

    public String maxlength() {
        return attr("maxlength");
    }

    public HTMLTextAreaElement maxlength(String value) {
        attr("maxlength", value);
        return this;
    }

    public String minlength() {
        return attr("minlength");
    }

    public HTMLTextAreaElement minlength(String value) {
        attr("minlength", value);
        return this;
    }

    public String name() {
        return attr("name");
    }

    public HTMLTextAreaElement name(String value) {
        attr("name", value);
        return this;
    }

    public String placeholder() {
        return attr("placeholder");
    }

    public HTMLTextAreaElement placeholder(String value) {
        attr("placeholder", value);
        return this;
    }

    public String readonly() {
        return attr("readonly");
    }

    public HTMLTextAreaElement readonly(String value) {
        attr("readonly", value);
        return this;
    }

    public String required() {
        return attr("required");
    }

    public HTMLTextAreaElement required(String value) {
        attr("required", value);
        return this;
    }

    public String rows() {
        return attr("rows");
    }

    public HTMLTextAreaElement rows(String value) {
        attr("rows", value);
        return this;
    }

    public String wrap() {
        return attr("wrap");
    }

    public HTMLTextAreaElement wrap(String value) {
        attr("wrap", value);
        return this;
    }
}
