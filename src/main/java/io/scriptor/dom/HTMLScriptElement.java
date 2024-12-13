package io.scriptor.dom;

public class HTMLScriptElement extends HTMLElement {

    public HTMLScriptElement() {
        super("script");
    }

    public String async() {
        return attr("async");
    }

    public HTMLScriptElement async(String value) {
        attr("async", value);
        return this;
    }

    public String blocking() {
        return attr("blocking");
    }

    public HTMLScriptElement blocking(String value) {
        attr("blocking", value);
        return this;
    }

    public String crossorigin() {
        return attr("crossorigin");
    }

    public HTMLScriptElement crossorigin(String value) {
        attr("crossorigin", value);
        return this;
    }

    public String defer() {
        return attr("defer");
    }

    public HTMLScriptElement defer(String value) {
        attr("defer", value);
        return this;
    }

    public String fetchpriority() {
        return attr("fetchpriority");
    }

    public HTMLScriptElement fetchpriority(String value) {
        attr("fetchpriority", value);
        return this;
    }

    public String integrity() {
        return attr("integrity");
    }

    public HTMLScriptElement integrity(String value) {
        attr("integrity", value);
        return this;
    }

    public String nomodule() {
        return attr("nomodule");
    }

    public HTMLScriptElement nomodule(String value) {
        attr("nomodule", value);
        return this;
    }

    public String referrerpolicy() {
        return attr("referrerpolicy");
    }

    public HTMLScriptElement referrerpolicy(String value) {
        attr("referrerpolicy", value);
        return this;
    }

    public String src() {
        return attr("src");
    }

    public HTMLScriptElement src(String value) {
        attr("src", value);
        return this;
    }

    public String type() {
        return attr("type");
    }

    public HTMLScriptElement type(String value) {
        attr("type", value);
        return this;
    }
}
