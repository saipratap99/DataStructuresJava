/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.graphs;

/**
A graph can be represented by ordered pair of set of V vertices and set of E edges
* G = (V,E) - representation of graph
* 
*/

public class GraphTest {
    public static void main(String[] args) {
        Graph<Integer> g = new Graph<>();
        g.addVertex(new Integer(0));
        g.addVertex(new Integer(1));
        g.addVertex(new Integer(2));
        g.addVertex(new Integer(3));
        g.addVertex(new Integer(4));
        
        g.addEdge(0, 1, true);
        g.addEdge(0, 2, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);
        
        System.out.println("No of vertexes: " + g.getVertexCount());
        System.out.println("No of edges: " + g.getEdgesCount(true));
        System.out.println("Has vertex: " + g.hasVertex(5));
        System.out.println("Has vertex: " + g.hasVertex(2));
        System.out.println("Has edge: " + g.hasEdge(1, 4));
        System.out.println("Has edge: " + g.hasEdge(2, 4));
        
        System.out.println("\n" + g);
        
        
    }
}
