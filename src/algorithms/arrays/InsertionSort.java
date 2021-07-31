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

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 1, -84, 25};
        for(int i=1;i<a.length;i++) {
            int curr = a[i];
            int j = i;
            while(j-1>=0 && a[j-1] > curr){
                a[j] = a[j-1];
                j--;
            }
            a[j] = curr;
        }
        
        System.out.println(Arrays.toString(a));
    }
}
