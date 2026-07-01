/* 

Problem Statement: Given an array containing only 0s, 1s, and 2s, sort the array in-place in ascending order.
  
I/P: {2, 0, 2, 1, 1, 0}
O/P: {0, 0, 1, 1, 2, 2}
   
*/

package arrays;

public class SortZerosOnesTwos {

    public static void sortElements(int[] arr) {
	
        int n = arr.length;
        
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        
        for (int i = 0; i < count0; i++) { 
            arr[i] = 0; 
        }
        for (int i = count0; i < count0 + count1; i++) { 
            arr[i] = 1; 
        }
        for (int i = count0 + count1; i < n; i++) { 
            arr[i] = 2; 
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortElements(arr);
        
        System.out.print("Sorted array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
