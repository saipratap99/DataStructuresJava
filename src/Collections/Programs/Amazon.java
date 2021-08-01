/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Programs;

import java.util.*;

public class Amazon {
    public static void main(String[] args) {
        LinkedHashMap<String,PairInt> items = new LinkedHashMap<>();
        items.put("item1",new PairInt(10, 15));
        items.put("item2",new PairInt(3, 4));
        items.put("item3",new PairInt(17, 8));
        System.out.println(items);
        List<String> res = fetchItemsToDisplay(3, items,2 , 1, 2, 1);
        System.out.println(res);
    }
    
    public static List<String> fetchItemsToDisplay(int numOfItems,LinkedHashMap<String,PairInt> items,int sortParameter,int sortOrder,int itemsPerPage,int PageNumber){
        List<String> itemnames = new ArrayList<>();
        List<Map.Entry<String,PairInt>> li = null;
        if(sortParameter == 0){
            itemnames = new ArrayList<>(items.keySet());
            if(sortOrder == 0)
                Collections.sort(itemnames);
            else
                Collections.sort(itemnames,Collections.reverseOrder());
            System.out.println(itemnames);
        }else if(sortParameter == 1){
            li = new LinkedList<>(items.entrySet());
            if(sortOrder == 0){
                Collections.sort(li,new Comparator<Map.Entry<String,PairInt>>(){
                    @Override
                    public int compare(Map.Entry<String, PairInt> o1, Map.Entry<String, PairInt> o2) {
                        return o1.getValue().first - o2.getValue().first;
                    }
                });
            }else{
                Collections.sort(li,new Comparator<Map.Entry<String,PairInt>>(){
                    @Override
                    public int compare(Map.Entry<String, PairInt> o1, Map.Entry<String, PairInt> o2) {
                        return o2.getValue().first - o1.getValue().first;
                    }
                });
            }
            
            for(Map.Entry<String,PairInt> ele:li)
                itemnames.add(ele.getKey());
        }else{
            li = new LinkedList<>(items.entrySet());
            if(sortOrder == 0){
                Collections.sort(li,(Map.Entry<String, PairInt> o1, Map.Entry<String, PairInt> o2)->{
                        return o1.getValue().second - o2.getValue().second;
                 });
            }else{
                Collections.sort(li,(Map.Entry<String, PairInt> o1, Map.Entry<String, PairInt> o2)->{
                        return o2.getValue().second - o1.getValue().second;
                    });
            }
            
            for(Map.Entry<String,PairInt> ele:li)
                itemnames.add(ele.getKey());
        }
        System.out.println("item names: " + itemnames);
        int from = PageNumber*itemsPerPage;
        int to = (from + itemsPerPage) <= itemnames.size() ? from + itemsPerPage : itemnames.size();
        return itemnames.subList(from,to);
    }
}


class PairInt{
    int first,second;

    public PairInt(int first,int second) {
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString(){
        return "[" + first + ", " + second+ "]";
    }
    
}
