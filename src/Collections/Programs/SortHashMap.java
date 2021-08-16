package Collections.Programs;


import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
// sort HashMap by keys
// sort HashMap by Values
public class SortHashMap {
    public static void main(String[] args) {
    // sort by keys
        Map<String,Integer> freq = new LinkedHashMap<>();
        
        // adding key value pairs
        freq.put("hello",3);
        freq.put("good", 2);
        freq.put("the", 6);
        freq.put("on", 1);
        freq.put("hash", 8);
        freq.put("map", 5);
        
        System.out.println("Before sorting:");
        for(Map.Entry<String,Integer> element: freq.entrySet()){
            System.out.println(element.getKey() + ": " + element.getValue());
        }
        
        // by default TreeMap sorts by Key, so no need of comparator 
        TreeMap<String,Integer> sortedByKeys = new TreeMap<>(freq);
        
        System.out.println("After sorting by keys: ");
        for(Map.Entry<String,Integer> element: sortedByKeys.entrySet()){
            System.out.println(element.getKey() + ": " + element.getValue());
        }
        
        
        // sort by values
        List<Map.Entry<String,Integer>> entryset = new LinkedList<>(freq.entrySet());
        Collections.sort(entryset,(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2)->{return o1.getValue() - o2.getValue();});
        Map<String,Integer> sortedByValues = new LinkedHashMap<>();
        entryset.forEach((e)->{sortedByValues.put(e.getKey(), e.getValue());});
        
        System.out.println("After sorting by values: ");
        for(Map.Entry<String,Integer> element: sortedByValues.entrySet()){
            System.out.println(element.getKey() + ": " + element.getValue());
        }
    }
}
