package com.model;

public class Node {
    private String name;

    public Node (String name){
    this.name = name;
    }
    public boolean equals(Node node) {
        return this.name.equals(node.getname());
    }

    public String getname() {
        return name;
    }
    public void setName(String name){

    }

}
