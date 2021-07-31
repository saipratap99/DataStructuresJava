/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.arrays;

import java.util.Arrays;


// sorted and unsorted partitions
// sorts from left to right
// initially we consider a[0] is the sorted partition
// assume initial element is sorted a[0], so we need to sort from 1
// O(n*n)
// in place sort 
// shift till we get less than element
public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 1, -84, 25};   
        int b[] = insertionsort(a);
        System.out.println(Arrays.toString(b));
    }
    
    public static int[] insertionsort(int[] a){
        
        for(int i=1;i<a.length;i++) {
            int curr = a[i];
            int j = i-1;
            while(j>=0 && a[j] > curr){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = curr;
        }
        return a;
    }
}