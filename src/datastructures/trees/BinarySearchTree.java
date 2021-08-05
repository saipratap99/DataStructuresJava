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
public class BinarySearchTree {
    public BinaryTreeNode root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    
    public void insert(int data){
        root = insertNode(root, data);
    }
    // insert node
    public BinaryTreeNode insertNode(BinaryTreeNode root,int data){
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(data);
        if(root == null){
            return binaryTreeNode;
        }
        if(data <= root.data) {
            root.leftNode = insertNode(root.leftNode, data);
        } else {
            root.rightNode = insertNode(root.rightNode, data);
        }
        return root;
            
    }
    
    /******** depth traversal *****************/
    public void inorder(){
        inorderTraversal(root);
        System.out.println();
    }
    public void preorder(){
        preorderTraversal(root);
        System.out.println();
    }
    
    public void inorderTraversal(BinaryTreeNode root){
            if(root != null){
                inorderTraversal(root.leftNode);
                System.out.print(root.data + "  ");
                inorderTraversal(root.rightNode);
            }
    }
    
    public void preorderTraversal(BinaryTreeNode root){
        if(root != null){
            System.out.print(root.data + "  ");
            preorderTraversal(root.leftNode);
            preorderTraversal(root.rightNode);
        }
    }
    
}
