/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.graphs;

import java.awt.print.Book;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 *  0  ---| 1
 * | |  /
 *  2  ---| 3  
 *
 *  1 pointing to 2
 */
public class GraphTraversal {
    
    private int V; // no of vertices
    private List<Integer> adj[];

    public GraphTraversal(int V) {
        this.V = V;
        adj = new LinkedList[this.V];
        for(int i=0;i<this.V;i++)
            adj[i] = new LinkedList<>();
    }
    
    public void addEdge(int source,int destination){
        adj[source].add(destination);
    }
    
    private void BFT(int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        boolean visited[] = new boolean[this.V];
        while(!queue.isEmpty()){
//            queue.addAll(adj[i]);
            int curr = queue.poll();
            if(!visited[curr]){
                System.out.print(curr + " ");
                queue.addAll(adj[curr]);
                visited[curr] = true;
            }
        }
        System.out.println();
    }
    
    
    public void DFT(int v,boolean[] visited){
        if(!visited[v]){
            System.out.print(v + " ");
            visited[v] = true;
            for(Integer i:adj[v]){
                DFT(i, visited);
            }
        }else
            return;
    }
    
    public static void main(String[] args) {
        GraphTraversal gt = new GraphTraversal(4);
        
        gt.addEdge(0, 1);
        gt.addEdge(1, 2);
        gt.addEdge(2, 3);
        gt.addEdge(0, 2);
        gt.addEdge(2, 0);
        gt.addEdge(3, 3);
        
        gt.BFT(2); // start with node 2
        gt.DFT(2, new boolean[4]); // starts with 2
        
        
    }
    
}
