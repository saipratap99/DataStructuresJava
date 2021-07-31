/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.arrays;

// Inplace
// stable sort 
// Divide and conquer
// Recursive
// O(nlogn)


import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {2,1,4,6,7,3,45};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    public static int[] mergesort(int[] arr) {
        int n = arr.length;
        if(n < 2)
            return arr;
        
        int mid = n/2;
        int larr[] = new int[mid];
        int rarr[] = new int[n-mid];
        for(int i=0;i<mid;i++)
            larr[i] = arr[i];
        for(int i=mid;i<n;i++)
            rarr[i-mid] = arr[i];
//        System.out.println("larr: " + Arrays.toString(larr));
//        System.out.println("rarr: " + Arrays.toString(rarr));
        larr = mergesort(larr);
        rarr = mergesort(rarr);
        arr = merge(larr,rarr);
        return arr;
    }
    
    public static int[] merge(int[] larr,int[] rarr){
        System.out.println("larr: " + Arrays.toString(larr));
        System.out.println("rarr: " + Arrays.toString(rarr));
        int l = larr.length,r = rarr.length;
        int arr[] = new int[l+r];
        int i = 0,j=0,k=0;
        while(i < l && j < r){
            if(larr[i] < rarr[j]){
                arr[k] = larr[i];
                i++;
            }else{
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
        while(i < l){
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j < r){
            arr[k] = rarr[j];
            j++;
            k++;
        }
        System.out.println("arr: " + Arrays.toString(arr));
        return arr;
    }
    
    
}
