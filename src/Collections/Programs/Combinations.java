/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Programs;

import java.util.Arrays;


public class Combinations {
    public static void main(String[] args) {
        int a[] = {1,9,4,3,2};
        getAllCombinations(a,3);
    }

    private static void getAllCombinations(int[] a,int r) {
        int data[] = new int[r];
        combinations(a,data,0,r,0);
    }

    private static void combinations(int[] a,int[] data,int start,int end,int pos) {
        if(start == end){
            System.out.println(Arrays.toString(data));
            return;
        }
        for(int i=pos;i<a.length;i++){
            data[start] = a[i];
            combinations(a, data, start+1, end, pos+1);
            pos++;
        }
    }
}
