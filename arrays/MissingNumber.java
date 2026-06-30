/*

Given an array containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.

Example
Input: arr = [3, 0, 1]
Output: 2

Explanation: n = 3 since there are 3 numbers. 
The range is [0, 3]. The missing number is 2.

*/

package arrays;

public class MissingNumber {

    public static int findMissingNum(int[] arr, int n) {

        int sum = 0, value = n * (n+1)/2;

        for(int i=0; i<n; i++) {
            sum += arr[i];
        }

        return value - sum;
    }

    public static void main(String[] args) {

        int[] arr = {3,0,2};
        int n = arr.length;

        System.out.println("The missing number is: " + findMissingNum(arr,n));

    }
}
