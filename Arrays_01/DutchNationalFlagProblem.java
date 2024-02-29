/*
 * Sort an array of 0s, 1s and 2s | Dutch National Flag problem
 * 
 *  Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given 
 *  array. The functions should put all 0s first, then all 1s and all 2s in last.
 * 
 *  This problem is also the same as the famous “Dutch National Flag problem”. The problem was proposed 
 *  by Edsger Dijkstra. The problem is as follows:
 *      Given N balls of colour red, white or blue arranged in a line in random order. You have to arrange all
 *      the balls such that the balls with the same colours are adjacent with the order of the balls, with the 
 *      order of the colours being red, white and blue (i.e., all red coloured balls come first then the white
 *      coloured balls and then the blue coloured balls). 
 */

package Arrays_01;

import java.util.Arrays;

public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        int arr1[] = { 0, 1, 2, 0, 1, 2 }; //Output: {0, 0, 1, 1, 2, 2}
        int arr2[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; //Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

        Duch_National_Flag(arr1);
        Duch_National_Flag(arr2);
    }
    
    public static void Duch_National_Flag(int arr[]) {
        int zero = 0, one = 0, two = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[one] == 0) {
                // swap with zero and one
                int temp = arr[zero];
                arr[zero] = arr[one];
                arr[one] = temp;

                zero += 1;
                one += 1;
            }

            else if (arr[one] == 1) {
                one += 1;
            }

            else if (arr[one] == 2) {
                // swap with one and two
                int temp = arr[one];
                arr[one] = arr[two];
                arr[two] = temp;

                two -= 1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
