package Arrays_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // reverseArr_method2(arr1);
        // reverseArr_method3(arr2);
        // reverseArr_method4(arr1, 0, arr1.length-1);
        reverseArr_method5(arr1);
    }

    // Sequential Approach
    public static void reverseArr_method1(int arr[]) {
        int resArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resArr[i] = arr[arr.length - i - 1]; // if length = 10 then last number is arr position 9
        }

        for (int i : resArr) {
            System.out.println(i);
        }
    }

    // swap the numbers
    public static void reverseArr_method2(int arr[]) {
        int s = 0, e = arr.length - 1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s += 1;
            e -= 1;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    // in built functions
    public static void reverseArr_method3(Integer arr[]) {

        Collections.reverse(Arrays.asList(arr));

        System.out.println(Arrays.toString(arr));
    }

    // using recursion
    public static void reverseArr_method4(int arr[], int s, int e) {

        System.out.println(Arrays.toString(arr));
        if (s >= e)
            return;

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverseArr_method4(arr, s + 1, e - 1);
    }
    
    // Using Stack Approach
    public static void reverseArr_method5(int arr[]) {
        Stack<Integer> res = new Stack<>();

        for (Integer i : arr) {
            res.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(res.peek());
            res.pop();
        }
    }
}
