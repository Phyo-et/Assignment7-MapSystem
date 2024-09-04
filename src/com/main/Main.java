package com.main;

import com.model.Graph;
import com.model.Node;
import com.service.SearchShortestPathService;

public class Main {
    public static void main(String[] args) {
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");
    Node nodeF = new Node("F");
    Node nodeG = new Node("G");
    Node nodeQ = new Node("H");

        Graph graph = new Graph();

        graph.addEdge(nodeA,nodeD,2);
        graph.addEdge(nodeA,nodeC,3);
        graph.addEdge(nodeA,nodeB,5);
        graph.addEdge(nodeA,nodeG,5);

        graph.addEdge(nodeD,nodeQ,6);
        graph.addEdge(nodeC,nodeQ,3);
        graph.addEdge(nodeB,nodeQ,8);

        graph.addEdge(nodeQ,nodeE,1);
        graph.addEdge(nodeQ,nodeF,1);
        graph.addEdge(nodeE,nodeF,1);

        SearchShortestPathService service = new SearchShortestPathService(graph, nodeA , nodeQ);
        service.call();
    }
}
