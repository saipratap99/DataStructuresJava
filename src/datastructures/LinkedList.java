/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author DELL
 */
public class LinkedList {

    Node head;

    public void insert(int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;
        // a node is created and inserted at the end 

        // but this is the first node or first element then we have to assign this node as head
        if (head == null) {
            head = n;
        } // else add the address of created node to last node of the list
        else {
            Node a = head;
            // in order to find last node we have to travel to last node from head
            while (a.next != null) {
                a = a.next;
            }
            a.next = n;
        }
    }

    // insert at start
    public void insertAtStart(int data) {
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;
    }

    // insert node at any position
    public void insertAt(int index, int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;
        if (index == 0) {
            insertAtStart(data);
        } 
        else {
            Node a = new Node();
            a = head;
            for (int i = 0; i < index - 1; i++) {
                if (a.next == null) {
                    System.out.println("index " + index + " is out of range!");
                    break;
                } else {
                    a = a.next;
                }
            }
            n.next = a.next;
            a.next = n;
        }
    }
    
    // delete at 
    
    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }
        else
        {
            Node n = new Node();
            n = head;
            for(int i=0;i<index-1;i++)
            {
                n = n.next;
            }
            n.next = n.next.next;
        }
    }
    
    // gets size of the list
    public int size(){
        int len = 0;
        Node n = new Node();
        n = head;
        while(n.next != null)
        {
            n = n.next;
            len++;
        }
        return ++len;
    }
    
    // show all the values
    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
