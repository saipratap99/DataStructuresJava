/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.trees;

/**
 *
 * @author DELL
 */
public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(10);
        tree.insert(5);
        tree.insert(12);
        tree.insert(16);
        tree.insert(3);
        tree.insert(11);
        tree.insert(7);
        
        tree.inorder();
        tree.preorder();
        BinaryTreeNode node = tree.binarySearch(0);
        System.out.println("Binary search: " + (node != null ? node.data : "Not found"));
    }
    
}
