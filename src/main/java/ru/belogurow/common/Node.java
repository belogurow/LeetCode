package ru.belogurow.common;

import java.util.List;

public class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
        this.children = List.of();
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
