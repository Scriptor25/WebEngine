package io.scriptor.dom;

public class HTMLImageElement extends HTMLElement {

    public HTMLImageElement() {
        super("img");
    }

    public String alt() {
        return attr("alt");
    }

    public HTMLImageElement alt(String value) {
        attr("alt", value);
        return this;
    }

    public String crossorigin() {
        return attr("crossorigin");
    }

    public HTMLImageElement crossorigin(String value) {
        attr("crossorigin", value);
        return this;
    }

    public String decoding() {
        return attr("decoding");
    }

    public HTMLImageElement decoding(String value) {
        attr("decoding", value);
        return this;
    }

    public String elementtiming() {
        return attr("elementtiming");
    }

    public HTMLImageElement elementtiming(String value) {
        attr("elementtiming", value);
        return this;
    }

    public String fetchpriority() {
        return attr("fetchpriority");
    }

    public HTMLImageElement fetchpriority(String value) {
        attr("fetchpriority", value);
        return this;
    }

    public String height() {
        return attr("height");
    }

    public HTMLImageElement height(String value) {
        attr("height", value);
        return this;
    }

    public String ismap() {
        return attr("ismap");
    }

    public HTMLImageElement ismap(String value) {
        attr("ismap", value);
        return this;
    }

    public String loading() {
        return attr("loading");
    }

    public HTMLImageElement loading(String value) {
        attr("loading", value);
        return this;
    }

    public String referrerpolicy() {
        return attr("referrerpolicy");
    }

    public HTMLImageElement referrerpolicy(String value) {
        attr("referrerpolicy", value);
        return this;
    }

    public String sizes() {
        return attr("sizes");
    }

    public HTMLImageElement sizes(String value) {
        attr("sizes", value);
        return this;
    }

    public String src() {
        return attr("src");
    }

    public HTMLImageElement src(String value) {
        attr("src", value);
        return this;
    }

    public String srcset() {
        return attr("srcset");
    }

    public HTMLImageElement srcset(String value) {
        attr("srcset", value);
        return this;
    }

    public String width() {
        return attr("width");
    }

    public HTMLImageElement width(String value) {
        attr("width", value);
        return this;
    }

    public String usemap() {
        return attr("usemap");
    }

    public HTMLImageElement usemap(String value) {
        attr("usemap", value);
        return this;
    }
}
