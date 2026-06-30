/*

 Problem Statement:
 
 Given an array of integers of size n, write a program to find and return all
 the repeating elements in the array. Each duplicate element should appear
 only once in the final output list.
 
 Sample Input & Output:
 Input Array (arr): {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1, 3, 4}
 Input Size (n): 14
 Expected Output: [1, 0, 2]
 
 */

package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {

    public static List<Integer> findRepeatingNum(int[] arr, int n) {

        List<Integer> RepeatingNum = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int currentNum = arr[i];

            if (seen.contains(currentNum)) {
                if (!RepeatingNum.contains(currentNum)) {
                    RepeatingNum.add(currentNum);
                }
            } else {
                seen.add(currentNum);
            }
        }

        return RepeatingNum;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1, 3, 4};
        int n = arr.length;

        System.out.println("Repeating elements from the array: " + findRepeatingNum(arr, n));
    }
}
