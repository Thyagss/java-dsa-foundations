/*
 
Problem Statement: Given two integer arrays, find their union. 
The union of two arrays contains all unique elements from both arrays.
 
I/P: a = {1, 2, 3, 4, 5}, b = {1, 2, 3, 6, 7}
O/P: [1, 2, 3, 4, 5, 6, 7]

 */

package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayUnion {

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        int len1 = a.length;
        int len2 = b.length;

        for (int i = 0; i < len1; i++) {
            if (!seen.contains(a[i])) {
                list.add(a[i]);
                seen.add(a[i]);
            }
        }

        for (int j = 0; j < len2; j++) {
            if (!seen.contains(b[j])) {
                list.add(b[j]);
                seen.add(b[j]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};

        System.out.println("Union of arrays: " + findUnion(a, b));
    }
}
