package Collections.Programs;

// Maps are key value pairs 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// used for search , update, delete on basis of key
// it doent allow null keys but allows null values
// Hashmaps doenot follows order
// linkedmaps follows order
// treemaps follow acending order

// Map canot be traversed so we need to convert it into set keySet() and entrySet()
public class HashMaps1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Banana", 3);
        map.put("Apple", 10);
        map.put("Mango", 1);
        map.put("Papaya", 6);
        
        System.out.println("Using Map.Entry: ");
        // iteterate 
        for(Map.Entry<String,Integer> e: map.entrySet())
             System.out.println(e.getKey() + ": " + e.getValue());
        
        System.out.println("Using forEach BiConsumer: ");
        map.forEach((k,v)->System.out.println(k + ": "+ v));
        
        
        System.out.println("Using Iterator: ");
        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()){
            String key = iter.next();
            System.out.println(key + ": " + map.get(key));
        }
        
        
        System.out.println("Using Iterator set and entryset: ");
        Set s = map.entrySet();
        Iterator iter2 = s.iterator();
        while (iter2.hasNext()) {
            Map.Entry<String,Integer> e = (Map.Entry<String,Integer>)iter2.next();
            System.out.println(e.getKey()+": " + e.getValue());
            
        }
    }
}
