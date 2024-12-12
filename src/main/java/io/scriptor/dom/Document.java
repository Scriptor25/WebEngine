package io.scriptor.dom;

import io.scriptor.dom.structure.*;

import java.util.ArrayList;
import java.util.List;

public class Document {

    public static Document from(org.jsoup.nodes.Document jsoup) {
        final var document = new Document();
        jsoup
                .childNodes()
                .stream()
                .filter(node -> !node.normalName().startsWith("#"))
                .map(Document::from)
                .forEach(document::append);
        return document;
    }

    public static HTMLElement from(org.jsoup.nodes.Node node) {
        final var element = switch (node.normalName()) {
            case "html" -> new HTMLRootElement();
            case "head" -> new HTMLHeadElement();
            case "meta" -> new HTMLMetaElement();
            case "title" -> new HTMLTitleElement();
            case "body" -> new HTMLBodyElement();

            default -> throw new IllegalStateException("unhandled case: " + node.normalName());
        };
        node
                .attributes()
                .forEach(attr -> element.attr(attr.getKey(), attr.getValue()));
        node
                .childNodes()
                .stream()
                .filter(n -> !n.normalName().startsWith("#"))
                .map(Document::from)
                .forEach(element::append);
        return element;
    }

    private final List<HTMLElement> elements = new ArrayList<>();

    public void append(HTMLElement element) {
        elements.add(element);
    }
}
