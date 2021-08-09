/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.graphs;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class GraphNode<T> {
    public T node;
    public boolean visited; 

    public GraphNode() {
        node = null;
        visited = false;
    }
    public GraphNode(T node) {
        this.node = node;
        visited = false;
    }
    
    public void visit(){
        this.visited = true;
    }
    
    public void unVisit(){
        this.visited  = false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        GraphNode<T> other = (GraphNode<T>) obj;
        return this.node.equals(other.node);
    }
    
    
    
}
