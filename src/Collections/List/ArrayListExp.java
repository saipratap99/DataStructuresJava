package Collections.List;

import java.util.*;

// Iterartor is root of all collections
// Iterator is implemented by collection interface
// Collection interface implemented by List , Queue and Set interfaces

// List is implemented by ArrayList, LinkedList , vector and Stack

public class ArrayListExp {

    public static void main(String args[]) {
        // creates a array list which is dynamic array
        ArrayList<String> list = new ArrayList<>();
        // adds elements to the list
        list.add("Bucket");
        list.add("Jug");
        list.add("Mirror");
        
        
        
        System.out.println("Using toString\n" + list);
        
        // iterator used to iterate over each element in the list
        
        // adding element at particular index
        list.add(1,"Bag");
        
        // Travesing using Iterator interface
        Iterator li1 = list.iterator();
        System.out.println("\nUsing  Iterator obj");
        while(li1.hasNext())
            System.out.println(li1.next());
        
        // creating another list
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Mango");
        list2.add("Grapes");
        
        // adding entire list to invoked list
        list.addAll(2,list2);
        
        System.out.println("\nUsing  For each loop");
        // Travesing using foreach loop
        for(String li:list)
            System.out.println(li);
        
        System.out.println("\nUsing  For  loop");
        // Travesing using for loop
        for(int i = 0;i<list.size();i++)
            System.out.println(list.get(i));
        
        // sorting ArrayList
        Collections.sort(list);
        
        System.out.println("\nUsing ListIterator obj");
        // Travesing using ListIterator obj
        ListIterator Litr = list.listIterator();
        while(Litr.hasNext())
            System.out.println(Litr.next());
        
        
        
    }
}
