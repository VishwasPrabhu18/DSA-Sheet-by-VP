/*
 * Move all negative numbers to beginning and positive to end with constant extra space
 * 
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so 
 * that all negative numbers appear before all positive numbers.
 */

package Arrays_01;

import java.util.Arrays;

public class PositiveNegativeSort {
    public static void main(String[] args) {
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

        // Direct Sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
