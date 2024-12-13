package io.scriptor.dom;

import imgui.ImGui;
import io.scriptor.Tab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Node implements Iterable<Node> {

    private final String tag;
    private Node parent;
    private String text;
    private final List<Node> children = new ArrayList<>();

    public Node(String tag) {
        this.tag = tag;
    }

    public void draw(Tab tab) {
        if (text != null) {
            final var txt = text();
            if (!txt.isEmpty())
                ImGui.textUnformatted(txt);
        } else drawChildNodes(tab);
    }

    public void drawChildNodes(Tab tab) {
        children.forEach(node -> node.draw(tab));
    }

    public String tag() {
        return tag;
    }

    public Node parentNode() {
        return parent;
    }

    public boolean hasText() {
        return text != null;
    }

    public String text() {
        if (text != null)
            return text.trim();

        return children
                .stream()
                .filter(Node::hasText)
                .map(Node::text)
                .collect(Collectors.joining());
    }

    public Node text(String value) {
        this.text = value;
        return this;
    }

    public Stream<Node> childNodes() {
        return children.stream();
    }

    public Node appendNode(Node value) {
        if (value.parent != null)
            value.parent.removeNode(value);
        value.parent = this;
        children.add(value);
        return this;
    }

    public Node prependNode(Node value) {
        if (value.parent != null)
            value.parent.removeNode(value);
        value.parent = this;
        children.addFirst(value);
        return this;
    }

    public Node removeNode(Node value) {
        children.remove(value);
        value.parent = null;
        return this;
    }

    @Override
    public Iterator<Node> iterator() {
        return children.iterator();
    }
}
