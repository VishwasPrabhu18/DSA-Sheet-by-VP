/*
 * Program to cyclically rotate an array by one
 * Given an array, the task is to cyclically rotate the array clockwise by one time.
 * 
 *      Input: arr[] = {1, 2, 3, 4, 5}
 *      Output: arr[] = {5, 1, 2, 3, 4}
 * 
 */

package Arrays_01;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[0] = last;

        System.out.println(Arrays.toString(arr));
    }
}
