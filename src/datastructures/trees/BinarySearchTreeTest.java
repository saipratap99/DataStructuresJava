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
        
        tree.insert(6);
        tree.insert(3);
        tree.insert(12);
        tree.insert(1);
        tree.insert(4);
        tree.insert(7);
        tree.insert(9);
        tree.insert(18);
        tree.insert(20);
        tree.insert(17);
        tree.insert(15);
        
        
        System.out.println("In order: ");
        tree.inorder();
        System.out.println("Pre order: ");
        tree.preorder();
        System.out.println("Level order: ");
        tree.levelOrder();
        BinaryTreeNode node = tree.binarySearch(0);
        System.out.println("Binary search: " + (node != null ? node.data : "Not found"));
        
        tree.delete(1);
        System.out.println("Deleted leaf node(1):");
        tree.inorder();
        
        tree.delete(12);
        System.out.println("Deleted node with 2 children(12): ");
        tree.inorder();
        
    }
    
}
