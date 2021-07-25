package algorithms.arrays;


import java.util.Arrays;

// In place algorithm (no need to create any extra array in order to sorts)
// O(n^2) (2 for loops)
// unStable sort

public class SelectionSort {

    public static void main(String[] args) {
        int a[] = {5, 6, 7, 1, -84, 25};
        int unsortedIndex = a.length - 1;
        while (unsortedIndex > 0) {
            int max = 0;
            for (int i = 1; i <= unsortedIndex; i++) {
                if (a[i] > a[max]) {
                    max = i;
                }
            }
            int temp = a[unsortedIndex];
            a[unsortedIndex] = a[max];
            a[max] = temp;
            unsortedIndex--;
        }
        System.out.println(Arrays.toString(a));
    }

}
