/*
 * Problem Statement: Given an array, rotate the array to the right by one position.
 * The last element should move to the first position, and all other elements shift right.
 *
 * I/P: {1, 2, 3, 4, 5, 6, 9}
 * O/P: {9, 1, 2, 3, 4, 5, 6}
 */

package arrays;

public class RotateArrayRight {

    public static void rotateByOne(int[] arr) {
      
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        int lastElement = arr[n - 1];
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = lastElement;
            lastElement = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9,0};

        rotateByOne(arr);
        System.out.print("Rotated Array: ");
        
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
