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
    
    public BinaryTreeNode binarySearch(int data){
        return searchNode(this.root, data);
    }
    
    public void delete(int data){
        root = deleteNode(root, data);
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
    
    // Binary search
    public BinaryTreeNode searchNode(BinaryTreeNode root,int data){
        if(root == null || root.data == data)
            return root;
        if(data <= root.data)
            return searchNode(root.leftNode,data);
        else
            return searchNode(root.rightNode,data);
            
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
    
    
    // deteling a node
    // Case 1: deleting the leaf node
    // Case 2: deleting the node with 1 child
    // case 3: deleting the node with 2 children
    
    public BinaryTreeNode deleteNode(BinaryTreeNode root,int data){
        // case 1 deleting the leaf nodes
        if(root == null)
            return null;
        if(root.data == data && root.leftNode == null && root.rightNode == null)
            return null;
        
        // case 2: deleting node with 1 child
        else if(root.data == data && (root.leftNode == null || root.rightNode == null)){
            if(root.leftNode != null)
                return root.leftNode;
            else
                return root.rightNode;
        }
        
        // case 3: deleting the node with 2 children
        else if(root.data == data){
            root.data = minValue(root.rightNode);
            root.rightNode = deleteNode(root.rightNode, root.data);
        }
        
        
        // case 3: deleting node with 2 children
        if(data <= root.data)
            root.leftNode = deleteNode(root.leftNode,data);
        else
            root.rightNode = deleteNode(root.rightNode, data);
        return root;
    }

    public int minValue(BinaryTreeNode root) {
        if(root.leftNode == null)
            return root.data;
        return minValue(root.leftNode);
    }
        
 
    
    
}

