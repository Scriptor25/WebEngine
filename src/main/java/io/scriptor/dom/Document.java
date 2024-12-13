package io.scriptor.dom;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Document {

    public static Document from(org.jsoup.nodes.Document jsoup) {
        final var document = new Document();
        jsoup
                .childNodes()
                .stream()
                .map(Document::from)
                .filter(Objects::nonNull)
                .forEach(document::append);
        return document;
    }

    public static Node from(org.jsoup.nodes.Node node) {
        if (node.normalName().startsWith("#"))
            return new Node().text(node.outerHtml());

        final var element = switch (node.normalName()) {
            case "html" -> new HTMLRootElement();
            case "head" -> new HTMLHeadElement();
            case "title" -> new HTMLTitleElement();
            case "meta" -> new HTMLMetaElement();
            case "script" -> new HTMLScriptElement();
            case "link" -> new HTMLLinkElement();
            case "style" -> new HTMLStyleElement();
            case "noscript" -> new HTMLNoScriptElement();
            case "body" -> new HTMLBodyElement();
            case "div" -> new HTMLDivElement();
            case "a" -> new HTMLAnchorElement();
            case "span" -> new HTMLSpanElement();
            case "picture" -> new HTMLPictureElement();
            case "img" -> new HTMLImageElement();
            case "button" -> new HTMLButtonElement();
            case "input" -> new HTMLInputElement();
            case "dialog" -> new HTMLDialogElement();
            case "form" -> new HTMLFormElement();
            case "textarea" -> new HTMLTextAreaElement();
            case "ul" -> new HTMLULElement();
            case "li" -> new HTMLLIElement();
            case "hr" -> new HTMLHRElement();
            case "h1" -> new HTMLH1Element();
            case "h2" -> new HTMLH2Element();
            case "h3" -> new HTMLH3Element();
            case "h4" -> new HTMLH4Element();
            case "h5" -> new HTMLH5Element();
            case "h6" -> new HTMLH6Element();
            case "p" -> new HTMLParagraphElement();

            case "svg", "center", "g-popup" -> null;

            default -> throw new IllegalStateException("unhandled case: " + node.normalName());
        };

        if (element == null)
            return null;

        node
                .attributes()
                .forEach(attr -> element.attr(attr.getKey(), attr.getValue()));

        node
                .childNodes()
                .stream()
                .map(Document::from)
                .filter(Objects::nonNull)
                .forEach(element::appendNode);

        return element;
    }

    private final List<Node> elements = new ArrayList<>();

    public void append(Node element) {
        elements.add(element);
    }

    public <T extends HTMLElement> Optional<T> findElementByTag(String tag) {
        return elements
                .stream()
                .filter(HTMLElement.class::isInstance)
                .map(HTMLElement.class::cast)
                .map(element -> element.<T>findElementByTag(tag))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
    }

    public String title() {
        return this
                .<HTMLTitleElement>findElementByTag("title")
                .orElseThrow()
                .text();
    }
}
