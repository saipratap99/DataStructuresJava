/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.arrays;

import java.util.Arrays;


// compares 2 adjacent element
// for each iteration it will sort and keep 1 element in appropriate position 


public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {5,6,7,1,-84,25};
        int unsorted = a.length-1;
        while(unsorted > 0){
            for(int i = 1;i<unsorted;i++){
                if(a[i-1] > a[i]){
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp; 
                }
            }
            unsorted--;
        }
        
        System.out.println(Arrays.toString(a));
    }
}
