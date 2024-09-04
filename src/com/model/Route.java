package com.model;

public class Route {
    public String nodeName;
    public Route parent;
    public Route child;

    public Route(String nodeName){
    this.nodeName = nodeName;
    }

    public void setParent(Route route) {
        this.parent = route;
    }

    public void addChild(Route route){
        this.child= route;
        this.child.setParent(this);
    }
}
