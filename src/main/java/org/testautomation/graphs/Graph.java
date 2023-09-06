package org.testautomation.graphs;

import org.testautomation.linkedlists.DoublyLinkedListWithTail;

public class Graph {
    int vertices;
    DoublyLinkedListWithTail<Integer>[] adjList;

    @SuppressWarnings("unchecked")
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new DoublyLinkedListWithTail[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new DoublyLinkedListWithTail<>();
        }
    }

    void addEdge(int source, int destination) {
        if ((source < vertices) && (destination < vertices)) {
            this.adjList[source].insertAtEnd(destination);

            // for undirected
            // adjList[destination].insertAtEnd(source);
        }
    }

    void printGraph() {
        System.out.println("## Adjacency List of Directed Graph ##");
        for (int i = 0; i < vertices; i++) {
            if (adjList[i] != null) {
                System.out.print("|" + i + "| => ");

                DoublyLinkedListWithTail<Integer>.Node temp = adjList[i].getHeadNode();
                while (temp != null) {
                    System.out.print("[" + temp.data + "] -> ");
                    temp = temp.nextNode;
                }
                System.out.println("null");
            } else {
                System.out.println("|" + i + "| => " + "null");
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        System.out.printf("A Graph with %s vertices.%n", graph.vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        graph.printGraph();
    }
}
