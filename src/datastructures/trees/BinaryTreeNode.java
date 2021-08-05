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
public class BinaryTreeNode{
    public int data;
    public BinaryTreeNode leftNode;
    public BinaryTreeNode rightNode;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }
}
