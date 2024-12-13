package io.scriptor.dom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Node implements Iterable<Node> {

    private Node parent;
    private String text;
    private final List<Node> children = new ArrayList<>();

    public Node parentNode() {
        return parent;
    }

    public boolean hasText() {
        return text != null;
    }

    public String text() {
        return text;
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
