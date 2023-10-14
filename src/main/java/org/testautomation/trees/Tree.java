package org.testautomation.trees;

import org.testautomation.graphs.Color;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node node = new Node(1, Color.GREEN);
        tree.setRoot(node);
        System.out.println("Size is " + tree.getSize());
        System.out.println("Root is " + tree.getRoot().id);
        System.out.println("Current is " + tree.getCurrent().id);
    }

    public static class Node {
        private final Color color;
        private final int id;
        Set<Node> children = new HashSet<>();

        public Node(int id, Color color) {
            this.id = id;
            this.color = color;
        }

        public int getId() {
            return id;
        }

        public Color getColor() {
            return color;
        }

        public Set<Node> getChildren() {
            return children;
        }
    }

    private int size;
    private Node root;
    private Node current;

    public void setRoot(Node node) {
        size = 1;
        root = node;
        current = root;
    }

    public Node getRoot() {
        return root;
    }

    public Node getCurrent() {
        return current;
    }

    public int getSize() {
        return size;
    }


    public void addChildToParent(Node parent, Node child) {
        parent.children.add(child);
        size++;
    }
}
