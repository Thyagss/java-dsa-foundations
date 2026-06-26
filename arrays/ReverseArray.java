package arrays;

public class ReverseArray {

    public static int[] reverse(int[] arr) {

        int[] reversedArray = new int[arr.length];

        int index = 0;

        for(int i=arr.length-1; i>=0; i--) {
            reversedArray[index] = arr[i];
            index++;
        }

        return reversedArray;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] result = ReverseArray.reverse(arr);

        for(int val : result)
        {
            System.out.print(val + " ");
        }

    }
}
