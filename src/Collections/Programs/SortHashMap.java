package Collections.Programs;


import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
// sort HashMap by keys
// sort HashMap by Values
public class SortHashMap {
    public static void main(String[] args) {
    // sort by keys
        Map<String,Integer> freq = new HashMap<>();
        
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
//        TreeMap<String,Integer> sortedByValues = new TreeMap<>(freq);
//        Collections.sort(sortedByValues, new Comparator<Object>(){
//            public int compare(Object o1,Object o2){
//                return ((Map.Entry<String,Integer>) o1).getValue() - ((Map.Entry<String,Integer>) o2).getValue();
//            }
//        });
    }
}
