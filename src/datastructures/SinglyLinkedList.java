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

public class SinglyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        list.insert(15);
        list.insert(1);
        list.insertAtStart(9);
        list.insert(48);
        list.insertAt(7, 189);
        list.deleteAt(3);
        list.show();
    }
}
