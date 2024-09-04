package com.model;

public class Edge {
    public Node startNode;
    public Node endNode;
    public int hours;

    public Edge(Node startNode,Node endNode ,int hours){
        this.startNode  = startNode;
        this.endNode = endNode;
        this.hours = hours;
    }
}
