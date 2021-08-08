package datastructures.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    private Map<T,List<T>> map = new HashMap<>();
    
    public void addVertex(T vertex){
        map.put(vertex,new LinkedList<>());
    }
    
    public void addEdge(T source, T destination,boolean isBidrectional){
        if(!map.containsKey(source))
            addVertex(source);
        if(!map.containsKey(destination))
            addVertex(destination);
        map.get(source).add(destination);
        if(isBidrectional) 
            map.get(destination).add(source);
    }
    
    public int getVertexCount(){
        return map.keySet().size();
    }
    
    public int getEdgesCount(boolean isBidrectinal){
        int count = 0;
        for(T v:map.keySet())
            count += map.get(v).size();
        if(isBidrectinal)
            count /= 2;
        return count;
    }
}
