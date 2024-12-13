package io.scriptor.dom;

public class HTMLLinkElement extends HTMLElement {

    public HTMLLinkElement() {
        super("link");
    }

    public String as() {
        return attr("as");
    }

    public HTMLLinkElement as(String value) {
        attr("as", value);
        return this;
    }

    public String blocking() {
        return attr("blocking");
    }

    public HTMLLinkElement blocking(String value) {
        attr("blocking", value);
        return this;
    }

    public String crossorigin() {
        return attr("crossorigin");
    }

    public HTMLLinkElement crossorigin(String value) {
        attr("crossorigin", value);
        return this;
    }

    public String disabled() {
        return attr("disabled");
    }

    public HTMLLinkElement disabled(String value) {
        attr("disabled", value);
        return this;
    }

    public String fetchpriority() {
        return attr("fetchpriority");
    }

    public HTMLLinkElement fetchpriority(String value) {
        attr("fetchpriority", value);
        return this;
    }

    public String href() {
        return attr("href");
    }

    public HTMLLinkElement href(String value) {
        attr("href", value);
        return this;
    }

    public String hreflang() {
        return attr("hreflang");
    }

    public HTMLLinkElement hreflang(String value) {
        attr("hreflang", value);
        return this;
    }

    public String imagesizes() {
        return attr("imagesizes");
    }

    public HTMLLinkElement imagesizes(String value) {
        attr("imagesizes", value);
        return this;
    }

    public String imagesrcset() {
        return attr("imagesrcset");
    }

    public HTMLLinkElement imagesrcset(String value) {
        attr("imagesrcset", value);
        return this;
    }

    public String integrity() {
        return attr("integrity");
    }

    public HTMLLinkElement integrity(String value) {
        attr("integrity", value);
        return this;
    }

    public String media() {
        return attr("media");
    }

    public HTMLLinkElement media(String value) {
        attr("media", value);
        return this;
    }

    public String referrerpolicy() {
        return attr("referrerpolicy");
    }

    public HTMLLinkElement referrerpolicy(String value) {
        attr("referrerpolicy", value);
        return this;
    }

    public String rel() {
        return attr("rel");
    }

    public HTMLLinkElement rel(String value) {
        attr("rel", value);
        return this;
    }

    public String sizes() {
        return attr("sizes");
    }

    public HTMLLinkElement sizes(String value) {
        attr("sizes", value);
        return this;
    }

    public String type() {
        return attr("type");
    }

    public HTMLLinkElement type(String value) {
        attr("type", value);
        return this;
    }
}
