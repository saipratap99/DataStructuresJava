package Collections.List;
import java.util.*;

public class LinkedListToArray {
    public static void main(String args[]){
        String[] obj = {"Laptop","Phone","Smart watch","Android Tv"};
        // Converting array to lInked list
        LinkedList<String> list = new LinkedList<>();
        
        // using for loop add each element
        for(String li:obj){
            list.add(li);
        }
        list.add("Bluetooth Speaker");
        list.add("Power bank");
        System.out.println("List: " + list);
        // Converting list to array
        String[] objs = list.toArray(new String[list.size()]);
        System.out.println("Array: " + Arrays.toString(objs));
    }
}
