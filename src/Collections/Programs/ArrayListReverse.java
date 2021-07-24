/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ArrayListReverse {
    public static void main(String[] args) {
        String[] arr = {"Virat","HC verma","VCS"};
        // using asList in Arrays
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        
        System.out.println("Asc: ");
        Collections.sort(list);
        System.out.println(list);
        
        // In reverse order
        System.out.println("Desc");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
        // Instead of type casting we can initialize object with size
        String names[] = list.toArray(new String[list.size()]);
        
        // using toString
        System.out.println(Arrays.toString(names));
    }
}
