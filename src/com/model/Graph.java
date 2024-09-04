package com.model;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Edge> edges;

    public Graph(){
        this.edges = new ArrayList<>();
    }
    public void addEdge(Node startNode, Node endNode,int hours ){
        Edge edge = new Edge(startNode,endNode,hours);
        this.edges.add(edge);
    }

    public List<Node> getChilds(Node node){
        List<Node> childs = new ArrayList<>();
        for (Edge edge: this.edges ){
            if (edge.startNode.equals(node)){
                childs.add(edge.endNode);
            }
        }
        return childs;
    }
 }
