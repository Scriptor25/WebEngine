package io.scriptor.dom;

import imgui.ImGui;
import imgui.flag.ImGuiCol;
import io.scriptor.Tab;

public class HTMLAnchorElement extends HTMLElement {

    public HTMLAnchorElement() {
        super("a");
    }

    @Override
    public void draw(Tab tab) {
        ImGui.pushStyleColor(ImGuiCol.Text, 0xffff0000);
        if (ImGui.selectable("##" + hashCode()))
            tab.load(href());
        ImGui.sameLine();
        super.draw(tab);
        ImGui.popStyleColor();
    }

    public String download() {
        return attr("download");
    }

    public HTMLAnchorElement download(String value) {
        attr("download", value);
        return this;
    }

    public String href() {
        return attr("href");
    }

    public HTMLAnchorElement href(String value) {
        attr("href", value);
        return this;
    }

    public String hreflang() {
        return attr("hreflang");
    }

    public HTMLAnchorElement hreflang(String value) {
        attr("hreflang", value);
        return this;
    }

    public String ping() {
        return attr("ping");
    }

    public HTMLAnchorElement ping(String value) {
        attr("ping", value);
        return this;
    }

    public String referrerpolicy() {
        return attr("referrerpolicy");
    }

    public HTMLAnchorElement referrerpolicy(String value) {
        attr("referrerpolicy", value);
        return this;
    }

    public String rel() {
        return attr("rel");
    }

    public HTMLAnchorElement rel(String value) {
        attr("rel", value);
        return this;
    }

    public String target() {
        return attr("target");
    }

    public HTMLAnchorElement target(String value) {
        attr("target", value);
        return this;
    }

    public String type() {
        return attr("type");
    }

    public HTMLAnchorElement type(String value) {
        attr("type", value);
        return this;
    }
}
