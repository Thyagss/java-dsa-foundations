/*
 * Problem Statement: Given an array of integers, write a program to rotate the array to the left by one position.
 * The first element should shift to the last position, and all other elements should move one position to the left.
 *
 * I/P: {1, 2, 3, 4, 5}
 * O/P: {2, 3, 4, 5, 1}
 */

package arrays;

public class RotateArrayLeft {

    public static void rotateLeftByOne(int[] arr) {

        int n = arr.length;
        int firstElement = arr[0];

        for(int i=1; i<n; i++) {
            arr[i-1] = arr[i];
        }

        arr[n-1] = firstElement;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        RotateArrayLeft.rotateLeftByOne(arr);
        System.out.print("Rotated Array By Left: ");

        for(int val: arr) {
            System.out.print(val + " ");
        }
    }
}
