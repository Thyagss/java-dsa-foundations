/*

 Program: Checks if an array is sorted in ascending order.

 Input 1: {1, 2, 3, 4, 6, 2, 8} 
 O/P: false
 
 Input 2: {10, 20, 30, 40, 50} 
 O/P: true

*/

package arrays;

public class CheckSortedArray {

    public static boolean isSorted(int[] arr) {

        if(arr.length <= 1) {
            return true;
        }
      
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,2,8};
        System.out.println("Is the array sorted : " + isSorted(arr));
    }
}
