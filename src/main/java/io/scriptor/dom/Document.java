package io.scriptor.dom;

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

    public static Node from(org.jsoup.nodes.Node jsoup) {
        if (jsoup.normalName().equals("#text"))
            return new Node("#text").text(jsoup.outerHtml());

        if (jsoup.normalName().startsWith("#"))
            return new Node(jsoup.normalName());

        final var node = switch (jsoup.normalName()) {
            case "a" -> new HTMLAnchorElement();
            case "body" -> new HTMLBodyElement();
            case "button" -> new HTMLButtonElement();
            case "dialog" -> new HTMLDialogElement();
            case "div" -> new HTMLDivElement();
            case "form" -> new HTMLFormElement();
            case "h1" -> new HTMLH1Element();
            case "h2" -> new HTMLH2Element();
            case "h3" -> new HTMLH3Element();
            case "h4" -> new HTMLH4Element();
            case "h5" -> new HTMLH5Element();
            case "h6" -> new HTMLH6Element();
            case "head" -> new HTMLHeadElement();
            case "header" -> new HTMLHeaderElement();
            case "hr" -> new HTMLHRElement();
            case "html" -> new HTMLRootElement();
            case "img" -> new HTMLImageElement();
            case "input" -> new HTMLInputElement();
            case "li" -> new HTMLLIElement();
            case "link" -> new HTMLLinkElement();
            case "meta" -> new HTMLMetaElement();
            case "nav" -> new HTMLNavElement();
            case "noscript" -> new HTMLNoScriptElement();
            case "p" -> new HTMLParagraphElement();
            case "picture" -> new HTMLPictureElement();
            case "script" -> new HTMLScriptElement();
            case "span" -> new HTMLSpanElement();
            case "style" -> new HTMLStyleElement();
            case "textarea" -> new HTMLTextAreaElement();
            case "title" -> new HTMLTitleElement();
            case "ul" -> new HTMLULElement();

            default -> {
                System.err.printf("unhandled node type '%s'%n", jsoup.normalName());
                yield new Node(jsoup.normalName());
            }
        };

        if (node instanceof HTMLElement el)
            jsoup
                    .attributes()
                    .forEach(attr -> el.attr(attr.getKey(), attr.getValue()));

        jsoup
                .childNodes()
                .stream()
                .map(Document::from)
                .filter(Objects::nonNull)
                .forEach(node::appendNode);

        return node;
    }

    private final Node rootNode = new Node(null);

    public void append(Node node) {
        rootNode.appendNode(node);
    }

    public <T extends HTMLElement> Optional<T> findElementByTag(String tag) {
        return rootNode
                .childNodes()
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
                .map(Node::text)
                .orElse(null);
    }

    public Node rootNode() {
        return rootNode;
    }
}
