/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Programs;

import java.util.PriorityQueue;

/**
 *
 * @author DELL
 */
public class HuffmanCoding {
    public static void main(String[] args) {
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>((o1,o2)->{return o1.data - o2.data;});
        for(int i=charArray.length-1;i>=0;i--)
            pq.add(new HuffmanNode(charfreq[i], charArray[i]));
        
        System.out.println("Priority Queue: " + pq);
        HuffmanNode root;
        while(pq.size() > 1){
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
//            System.out.println("l: " + left.data + "  r: " + right.data);
            root = new HuffmanNode(left.data + right.data,' ', left, right);
            pq.add(root);
        }
        root = pq.peek();
        printCode(root,"");
    }

    private static void printCode(HuffmanNode root,String s) {
        if(root.left == null && root.right == null){
            System.out.println(root.c + ": " + s);
            return;
        }
        if(root != null){
            printCode(root.left, s + "0");
            printCode(root.right, s + "1");
        }
    }
    
}

class HuffmanNode{
    int data;
    char c;
    
    HuffmanNode left;
    HuffmanNode right;

    public HuffmanNode(int data, char c) {
        this.data = data;
        this.c = c;
        
        this.left = null;
        this.right = null;
    }

    public HuffmanNode(int data, char c, HuffmanNode left, HuffmanNode right) {
        this.data = data;
        this.c = c;
        this.left = left;
        this.right = right;
    }
    
    
    @Override
    public String toString() {
        return c + ": " + data; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}


