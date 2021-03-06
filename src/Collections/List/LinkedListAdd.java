/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.List;

import java.util.*;
/**
 *
 * @author DELL
 */


public class LinkedListAdd {
    public static void main(String args[]){
        
        // Linked list is doubly linked list here
        LinkedList<String> dll = new LinkedList<>();
        
        // different adding methods
        dll.add("Jumping Jacks");
        dll.add("Burpees");
        dll.add(1,"Long jumps");
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Push ups");
        list.add("Pull ups");
        
        dll.addAll(1,list);
        
        // Traversing through list using ListIterator
        ListIterator li = dll.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
        
        
        // removing list elements
        
        // remove all the list items
        
        dll.removeAll(list);
        System.out.println("\nAfter using removeall"+dll);
        
        dll.removeFirst();
        dll.remove("Burpees");
        System.out.println("\nAfter using remove and removeFirst:"+dll);
        
        dll.add("Streching");
        dll.add("Streching");
        dll.add("Streching");
        dll.add("Streching");
        
        dll.removeFirstOccurrence("Streching");
        dll.removeLastOccurrence("Streching");
        System.out.println("\nAfter removing first last occurences:"+dll);
        
    }
}
