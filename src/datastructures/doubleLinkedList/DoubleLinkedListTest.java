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
public class DoubleLinkedListTest {

    public static void main(String args[]) {
        DoubleLinkedList list = new DoubleLinkedList();
        // data inserting using insert
        System.out.println("*** Data inserted using insert ***");
        list.insert(4);
        list.insert(6);
        list.insert(8);
        System.out.println("Linked list:");
        list.show();
        System.out.println("*** Data inserted using insertAt and insertAtStart ***");
        list.insertAt(1,11);
        list.insertAtStart(45);
        list.insertAt(2,5);
        System.out.println("Linked list:");
        list.show();
        System.out.println("*** Data deleted using deletetAt ***");
        list.deleteAt(2);
        list.deleteAt(0);
        System.out.println("Linked list:");
        list.show();

    }
}
