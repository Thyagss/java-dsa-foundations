package arrays;

import java.util.Arrays;

public class RotateArrayRightByK {

    public static void rotateRight(int[] arr, int k) {
      
        int n = arr.length;
      
        if (n == 0) return;

        k = k % n;

        // to store last elements of the array
        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        rotateRight(arr, 2);
        System.out.println("Right Rotation: ");

        for(int val : arr) {
            System.out.print(val+ " ");
        }
    }
}
