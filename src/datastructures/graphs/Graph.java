package datastructures.graphs;

/**
A graph can be represented by ordered pair of set of V vertices and set of E edges
* G = (V,E) - representation of graph
* 
*/
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
        count = map.keySet().stream().map((v) -> map.get(v).size()).reduce(count, Integer::sum);
        if(isBidrectinal)
            count /= 2;
        return count;
    }
    
    public boolean hasVertex(T v){
        return map.containsKey(v);
    }
    
    public boolean hasEdge(T source,T destination){
        if(map.containsKey(source)){
            return map.get(source).contains(destination);
        }
        return false;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(T v:map.keySet()){
            sb.append(v.toString() + ": ");
            for(T ed: map.get(v)){
                sb.append(ed.toString() + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
