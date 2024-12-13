package io.scriptor.dom;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class HTMLElement extends Node {

    private final Map<String, String> attrs = new HashMap<>();

    protected HTMLElement(String tag) {
        super(tag);
    }

    public Stream<HTMLElement> childElements() {
        return childNodes()
                .filter(HTMLElement.class::isInstance)
                .map(HTMLElement.class::cast);
    }

    public <T extends HTMLElement> Optional<T> findElementByTag(String tag) {
        if (this.tag().equals(tag))
            return Optional.of((T) this);
        return childElements()
                .map(element -> element.<T>findElementByTag(tag))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
    }

    public String attr(String name) {
        return attrs.get(name);
    }

    public HTMLElement attr(String name, String value) {
        attrs.put(name, value);
        return this;
    }

    public String accesskey() {
        return attr("accesskey");
    }

    public HTMLElement accesskey(String value) {
        return attr("accesskey", value);
    }

    public String autocapitalize() {
        return attr("autocapitalize");
    }

    public HTMLElement autocapitalize(String value) {
        return attr("autocapitalize", value);
    }

    public String autofocus() {
        return attr("autofocus");
    }

    public HTMLElement autofocus(String value) {
        return attr("autofocus", value);
    }

    public String clazz() {
        return attr("class");
    }

    public HTMLElement clazz(String value) {
        return attr("class", value);
    }

    public String contenteditable() {
        return attr("contenteditable");
    }

    public HTMLElement contenteditable(String value) {
        return attr("contenteditable", value);
    }

    public String data(String id) {
        return attr("data-" + id);
    }

    public HTMLElement data(String id, String value) {
        return attr("data-" + id, value);
    }

    public String dir() {
        return attr("dir");
    }

    public HTMLElement dir(String value) {
        return attr("dir", value);
    }

    public String draggable() {
        return attr("draggable");
    }

    public HTMLElement draggable(String value) {
        return attr("draggable", value);
    }

    public String enterkeyhint() {
        return attr("enterkeyhint");
    }

    public HTMLElement enterkeyhint(String value) {
        return attr("enterkeyhint", value);
    }

    public String exportparts() {
        return attr("exportparts");
    }

    public HTMLElement exportparts(String value) {
        return attr("exportparts", value);
    }

    public String hidden() {
        return attr("hidden");
    }

    public HTMLElement hidden(String value) {
        return attr("hidden", value);
    }

    public String id() {
        return attr("id");
    }

    public HTMLElement id(String value) {
        return attr("id", value);
    }

    public String inert() {
        return attr("inert");
    }

    public HTMLElement inert(String value) {
        return attr("inert", value);
    }

    public String inputmode() {
        return attr("inputmode");
    }

    public HTMLElement inputmode(String value) {
        return attr("inputmode", value);
    }

    public String is() {
        return attr("is");
    }

    public HTMLElement is(String value) {
        return attr("is", value);
    }

    public String itemid() {
        return attr("itemid");
    }

    public HTMLElement itemid(String value) {
        return attr("itemid", value);
    }

    public String itemprop() {
        return attr("itemprop");
    }

    public HTMLElement itemprop(String value) {
        return attr("itemprop", value);
    }

    public String itemref() {
        return attr("itemref");
    }

    public HTMLElement itemref(String value) {
        return attr("itemref", value);
    }

    public String itemscope() {
        return attr("itemscope");
    }

    public HTMLElement itemscope(String value) {
        return attr("itemscope", value);
    }

    public String itemtype() {
        return attr("itemtype");
    }

    public HTMLElement itemtype(String value) {
        return attr("itemtype", value);
    }

    public String lang() {
        return attr("lang");
    }

    public HTMLElement lang(String value) {
        return attr("lang", value);
    }

    public String nonce() {
        return attr("nonce");
    }

    public HTMLElement nonce(String value) {
        return attr("nonce", value);
    }

    public String part() {
        return attr("part");
    }

    public HTMLElement part(String value) {
        return attr("part", value);
    }

    public String popover() {
        return attr("popover");
    }

    public HTMLElement popover(String value) {
        return attr("popover", value);
    }

    public String role() {
        return attr("role");
    }

    public HTMLElement role(String value) {
        return attr("role", value);
    }

    public String slot() {
        return attr("slot");
    }

    public HTMLElement slot(String value) {
        return attr("slot", value);
    }

    public String spellcheck() {
        return attr("spellcheck");
    }

    public HTMLElement spellcheck(String value) {
        return attr("spellcheck", value);
    }

    public String style() {
        return attr("style");
    }

    public HTMLElement style(String value) {
        return attr("style", value);
    }

    public String tabindex() {
        return attr("tabindex");
    }

    public HTMLElement tabindex(String value) {
        return attr("tabindex", value);
    }

    public String title() {
        return attr("title");
    }

    public HTMLElement title(String value) {
        return attr("title", value);
    }

    public String translate() {
        return attr("translate");
    }

    public HTMLElement translate(String value) {
        return attr("translate", value);
    }

    public String writingsuggestions() {
        return attr("writingsuggestions");
    }

    public HTMLElement writingsuggestions(String value) {
        return attr("writingsuggestions", value);
    }
}
