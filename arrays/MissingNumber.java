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
