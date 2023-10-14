package org.testautomation.graphs;

import org.testautomation.trees.Tree;

import java.util.*;

public class ColorGraph {

    private final Map<Vertex, Set<Vertex>> adjVertices = new HashMap<>();

    public void addVertex(int id, Color color) {
        adjVertices.putIfAbsent(new Vertex(id, color), new HashSet<>());
    }

    public Vertex getVertex(int id) {
        Set<Vertex> allVertices = adjVertices.keySet();
        for (Vertex v : allVertices) {
            if (v.id() == id) {
                return v;
            }
        }
        return null;
    }

    public Set<Vertex> getVertices() {
        return adjVertices.keySet();
    }

    public Set<Vertex> getEdges(int id) {
        Vertex v = getVertex(id);
        return adjVertices.get(v);
    }

    public void removeVertex(int id) {
        Vertex v = getVertex(id);
        adjVertices.remove(v);
    }

    public void addEdge(int id1, int id2) {
        Vertex v1 = getVertex(id1);
        Vertex v2 = getVertex(id2);
        if (v1 == null || v2 == null) return;

        // Add edge v2 to v1
        Set<Vertex> edgesV1 = getEdges(id1);
        if (edgesV1 == null) {
            edgesV1 = new HashSet<>();
        }
        edgesV1.add(v2);

        // Add edge v1 to v2
        Set<Vertex> edgesV2 = getEdges(id2);
        if (edgesV2 == null) {
            edgesV2 = new HashSet<>();
        }
        edgesV2.add(v1);
    }

    public void removeEdge(int id1, int id2) {

        // Confirm the vertices exist
        Vertex v1 = getVertex(id1);
        Vertex v2 = getVertex(id2);
        if (v1 == null || v2 == null) return;

        // If present, remove v2 from v1
        Set<Vertex> v1Edges = getEdges(id1);
        if (v1Edges == null) return;
        v1Edges.remove(v2);

        // If present, remove v1 from v2
        Set<Vertex> v2Edges = getEdges(id2);
        if (v2Edges == null) return;
        v2Edges.remove(v1);
    }

    public void display() {
        Set<Vertex> keys = adjVertices.keySet();
        for (Vertex v : keys) {
            System.out.print(v.id() + "," + v.color() + ": \t");
            Set<Vertex> edges = adjVertices.get(v);
            if (edges == null) return;
            for (Vertex e : edges) {
                System.out.print(e.id() + "," + e.color() + "\t");
            }
            System.out.println();
        }
    }

    public void display(int id) {
        Vertex v = getVertex(id);
        if (v == null) {
            System.out.println("Cannot find Vertex with id " + id);
        } else {
            System.out.print(v.id() + "," + v.color() + ":\t");
            Set<Vertex> edges = adjVertices.get(v);
            if (edges == null) return;
          for (Vertex e : adjVertices.get(v)) {
              System.out.print(v.id() + "," + e.color() + "\t");
          }
          System.out.println();
        }
    }

    public static void main(String[] args) {
        ColorGraph graph = new ColorGraph();
        graph.addVertex(1, Color.RED);
        graph.addVertex(2, Color.BLACK);
        graph.addVertex(3, Color.GREEN);
        graph.addVertex(4, Color.GREEN);
        graph.addVertex(5, Color.GREEN);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 2);
        graph.addEdge(4, 2);

//        graph.display(1);
//        System.out.println("------------------------------");
        graph.display();
        System.out.println("------------------------------");

        graph.test();

//        List<List<Vertex>> paths = graph.getValidPaths();
//
//        for (List<Vertex> path : paths) {
//            for (Vertex v : path) {
//                System.out.print(v + "\t");
//            }
//            System.out.println();
//        }
    }

    public void test() {
        Set<Tree> treeList = new HashSet<>();
        for (Vertex v : getVertices()) {
            if (v.color().equals(Color.GREEN)) {
                Tree tree = new Tree();
                Tree.Node node = new Tree.Node(v.id(), v.color());
                tree.setRoot(node);
                treeList.add(tree);
            }
        }

        for (Tree tree : treeList) {
            Set<Vertex> edges = getEdges(tree.getRoot().getId());
            for (Vertex edge : edges) {
                if (edge.color().equals(Color.GREEN)) {
                    addNodes(tree, tree.getCurrent().getChildren());
                }
            }
        }
    }

    void addNodes(Tree tree, Set<Tree.Node> nodes) {
        for (Tree.Node node : nodes) {
            if (!node.getColor().equals(Color.BLACK)) {
                Set<Vertex> edges = getEdges(node.getId());
                for (Vertex e : edges) {
                    if (e.color().equals(Color.GREEN) || e.color().equals(Color.BLACK)) {
                        Tree.Node child = new Tree.Node(e.id(), e.color());
                        tree.addChildToParent(node, child);
                        addNodes(tree, node.getChildren());
                    }
                }
            }
        }
    }

    // Must all be green and end in black
    public List<List<Vertex>> getValidPaths() {
        Set<Vertex> usedVertices = new HashSet<>();
        List<List<Vertex>> validPaths = new ArrayList<>();
        List<Vertex> nextValidPath = new ArrayList<>();
        for (Vertex v : adjVertices.keySet()) {
            if (v.color().equals(Color.GREEN)) {
                if (usedVertices.contains(v)) {
                    continue;
                } else {
                    usedVertices.add(v);
                    nextValidPath.add(v);
                    Set<Vertex> edges = getEdges(v.id());
                    for (Vertex edge : edges) {
                        if (usedVertices.contains(edge)) {
                            continue;
                        } else {
                            if (edge.color().equals(Color.GREEN)) {
                                nextValidPath.add(v);
                            } else if (edge.color().equals(Color.BLACK)) {
                                nextValidPath.add(v);
                                validPaths.add(nextValidPath);
                            } else {
                                nextValidPath = new ArrayList<>();
                                break;
                            }
                        }
                    }
                }
            }
        }
        return validPaths;
    }
}