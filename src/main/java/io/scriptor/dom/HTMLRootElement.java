package io.scriptor.dom;

public class HTMLRootElement extends HTMLElement {

    public HTMLRootElement() {
        super("html");
    }

    public String version() {
        return attr("version");
    }

    public HTMLRootElement version(String version) {
        attr("version", version);
        return this;
    }

    public String xmlns() {
        return attr("xmlns");
    }

    public HTMLRootElement xmlns(String xmlns) {
        attr("xmlns", xmlns);
        return this;
    }
}
