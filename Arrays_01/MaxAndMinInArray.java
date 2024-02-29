/*
 * Maximum and minimum of an array using minimum number of comparisons
 */

package Arrays_01;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        int arr[] = { 9, 5, 3, 6, 2, 1, 4, 8, 7 };

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)
                max = arr[i];
        }
        
        System.out.println("Min : " + min + " Max : " + max);
    }
}
