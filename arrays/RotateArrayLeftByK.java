package arrays;

import java.util.Arrays;

public class RotateArrayLeftByK {

    public static void rotateLeft(int[] arr, int k) {

        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        int[] temp = Arrays.copyOfRange(arr, 0, k);

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        rotateLeft(arr, 2);
        System.out.println("Left Rotation: ");

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
