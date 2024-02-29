/*
 * K’th Smallest/Largest Element in Unsorted Array | Expected Linear Time
 * 
 * Input: arr[] = {7, 10, 4, 3, 20, 15} 
 * k = 3
 * Output: 7
 * 
 */
package Arrays_01;

import java.util.Arrays;

public class KthSmallestNumber {
    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 20, 15 };
        int k = 3;

        // sort this using any sort
        // here i'm using insertion sort

        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];

            for (int j = i + 1; j < arr.length - 1; j++) {
                if (v > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        int res = arr[k - 1];

        System.out.println(Arrays.toString(arr) + "\nKth smallest number : " + res);
    }
}
