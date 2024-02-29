/*
 * Find Union and Intersection of two unsorted arrays
 * Given two unsorted arrays that represent two sets (elements in every array are distinct), 
 * find the union and intersection of two arrays.
 */

package Arrays_01;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionAndIntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 3, 8, 6, 20, 7 };

        unionOfArray(arr1, arr2);
        intersectionOfArray(arr1, arr2);
    }
    
    public static void unionOfArray(int A[], int B[]) {
        HashSet<Integer> unionArr = new HashSet<>();

        for (int i : A) {
            unionArr.add(i);
        }
        for (int i : B) {
            unionArr.add(i);
        }

        System.out.println(unionArr);
    }

    public static void intersectionOfArray(int A[], int B[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        ArrayList<Integer> interArr = new ArrayList<>();

        for (int i : A) {
            arr.add(i);
        }

        for (int i : B) {
            if (arr.contains(i)) {
                interArr.add(i);
            }
        }

        System.out.println(interArr);
    }
}
