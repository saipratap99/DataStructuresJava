package Collections.Sets;

import java.util.*;
// TreeSet mains the Ascending order
// Only difference is it does not accept null values

public class TreeSet1 {

    public static void main(String args[]) {
        TreeSet<String> students = new TreeSet<>();
        students.add("Pratap");
        students.add("Varun");
        students.add("Tej");
        
        // It will thrown an error if we try to add
        //students.add(null);

        // Travering in  accesding order
        Iterator itr1 = students.iterator();
        System.out.println("Travesing in accending order: ");
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        // Travering in  decending order order
        itr1 = students.descendingIterator();
        System.out.println("Travesing in decending order: ");
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("Highest Value: " + students.pollFirst());
        System.out.println("Lowest Value: " + students.pollLast());
        
        System.out.println("After poll values in Set: " + students);
    }
}
