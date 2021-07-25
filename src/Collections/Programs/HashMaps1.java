package Collections.Programs;

// Maps are key value pairs 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
    }
}
