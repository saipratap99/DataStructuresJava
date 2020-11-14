/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.doubleLinkedList;

/**
 *
 * @author DELL
 */
public class DoubleLinkedList {

    // first and last nodes
    Node firstNode;
    Node lastNode;

    // insertin Node at the end
    public void insert(int data) {
        // creating a new node
        Node n = new Node();
        // assign data 
        n.data = data;
        // next and previous are null
        n.next = null;
        n.previous = null;
        // a node is created and inserted at the end 

        // but this is the first node or first element then we have to assign this node as head
        if (firstNode == null) {
            firstNode = n;
        } // else add the address of created node to last node of the list
        else {
            Node a = firstNode;
            // in order to find last node we have to travel to last node from head
            while (a.next != null) {
                a = a.next;
            }
            // node n previous points to a node
            n.previous = a;
            // next node of a points to node n
            a.next = n;

        }
    }

    // insert at start
    public void insertAtStart(int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;
        n.previous = null;
        // new node next points firstNode of the list
        n.next = firstNode;
        // firstNode previous points to new node created n
        firstNode.previous = n;
        // then makes the new node as first node
        firstNode = n;
    }

    // insert node at any position
    public void insertAt(int index, int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;
        n.previous = null;
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node a = new Node();
            a = firstNode;
            // goes till (index-1)th node 
            for (int i = 0; i < index - 1; i++) {
                // in this process if reaches the end of LL then stops looping
                // and adds at the end of the LL
                if (a.next == null) {
                    System.out.println("index " + index + " is out of range!");
                    break;
                } else {
                    // else continues
                    a = a.next;
                }
            }
            // then adds the creaed node depenting on the Node a posistion
            // the node at index th node points by the new node created
            n.next = a.next;
            a.next = n;
            n.next.previous = n;
            n.previous = a;
        }
    }

    // deletes the node at given index
    public void deleteAt(int index) {
        if (index == 0) {
            firstNode = firstNode.next;
        } else {
            Node a = new Node();
            a = firstNode;
            // goes till (index-1)th node 
            for (int i = 0; i < index - 1; i++) {
                // in this process if reaches the end of LL then stops looping
                // and adds at the end of the LL
                if (a.next == null) {
                    System.out.println("index " + index + " is out of range!");
                    break;
                } else {
                    // else continues
                    a = a.next;
                }
            }
            // next node of node a point next next node
            a.next = a.next.next;
            // the nide a next's previous point to node a 
            a.next.previous = a;
        }
    }

// show all the values
    public void show() {
        // starts from firstNode
        Node n = firstNode;
        System.out.print("[");
        // loop continues till next node points to NULL 
        while (n.next != null) {
            System.out.print(n.data + ",");
            n = n.next;
        }
        // prints the last Node data
        System.out.println(n.data + "]");
    }
}
