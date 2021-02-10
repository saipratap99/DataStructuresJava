package Collections.Sets;
import java.util.*;

// Sets allow only distinct elements
// The elemenets will not follow the order of insertion
// Ieterator is used to traverse
public class HashSet1 {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Mango");
        set.add("Grapes");
        System.out.println("Set: " + set);
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Kiwi");
        list.add("Banana");
        
        set.addAll(list);
        System.out.println("After adding arrayList list -> Set: " + set);
        set.remove("Kiwi");
        System.out.println("After calling remove('Kiwi') -> Set: " + set);
        set.removeAll(list);
        System.out.println("After calling removeall -> Set: " + set);
        
        set.add("Mango");
        System.out.println("After adding mango again -> Set: " + set);
        
        HashSet<String> set2 = new HashSet<>(list);
        System.out.println("Set2: " + set2);
        
        
    }
}
