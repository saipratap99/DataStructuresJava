package Collections.List;

import java.util.*;

// List Iterator is used to traverse in both the directions
// but Iterator can traverse in only forward direction and also cannot modify the list
public class ListIteratorExp {

    public static void main(String ars[]) {
        LinkedList<String> todolist = new LinkedList<>();
        todolist.add("Buy Groceries");
        todolist.add("Refuel the car");
        todolist.add("Pay Bills");
        
        ListIterator itr1 = todolist.listIterator();
        System.out.println("Traversing in forward direction: ");
        while(itr1.hasNext())
            System.out.println("Index: " + itr1.nextIndex() + "  Value: " + itr1.next());
        System.out.println("\nTraversing in backward direction: ");
        while(itr1.hasPrevious())
            System.out.println("Index: " + itr1.previousIndex() + "  Value: " + itr1.previous());
        
    }
}
