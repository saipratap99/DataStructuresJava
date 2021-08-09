/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Programs;

/**
 *
 * @author DELL
 */
public class Permutations {
    public static void main(String[] args) {
        int a[] = {1,9,4,3};
        getAllPermutations(a);
    }

    private static void getAllPermutations(int[] a) {
        permute(a,0);
    }

    private static void permute(int[] a, int pos) {
        
        // if pos reaches the end of the the array then print the array
        if(pos >= a.length-1){
            System.out.print("[");
            for(int i=0;i<a.length-1;i++){
                System.out.print(a[i] + ",");
            }
            System.out.println(a[a.length-1]+"]");
            return;
        }
        
        // no need to sawp or replace the last element
        for(int i=pos;i<a.length;i++){
            a = swap(a,pos,i);  // swap
            permute(a, pos+1);
            a = swap(a,pos,i);  // backtracting (restoring the array 
        }
    }
    
    private static int[] swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
    
}
