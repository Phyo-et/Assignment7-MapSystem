package com.service;

import com.model.Graph;
import com.model.Node;
import com.model.Route;

import java.util.ArrayList;
import java.util.List;

public class SearchShortestPathService {
    private Node startNode;
    private Node endNode;
    private Graph graph;
    private List<Route> routes;

    public SearchShortestPathService(Graph graph, Node startNode, Node endNode){
        this.startNode = startNode;
        this.endNode = endNode;
        this.graph = graph;
        this.routes = new ArrayList<>();
    }
    public void call(){
        travelEdge(this.startNode,null);
        displayRoutes();
    }
    public void displayRoutes(){
        for (Route route : this.routes){
            this.display(route,null);
        }
    }
    public void display(Route route ,String str){
        if(route.parent!=null){
            str = route.nodeName+ "=>"+str;
            display(route.parent,str);
        }else{
            System.out.println(route.nodeName+"=>"+ str);
        }
    }
    public void travelEdge(Node currentNode, Route preRoute){
        List<Node> childs = this.graph.getChilds(currentNode);
        if (preRoute == null) {
            preRoute = new Route(currentNode.getname());
        }
            for (Node child : childs) {
                Route childRoute = new Route(child.getname());
                preRoute.addChild(childRoute);

                if (child.equals(endNode)) {
                    //base case
                } else {
                    travelEdge(child,childRoute);
                    //recarsective case
                }
            }
        }

}
