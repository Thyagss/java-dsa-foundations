package arrays;

public class LinearSearch {

    public int searchElement(int[] arr, int target) {

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        LinearSearch obj = new LinearSearch();
        
        int[] arr = {1,2,3,4,5,6,7};
        int index = obj.searchElement(arr, 7);

        System.out.println("Element found at index: " + index);

    }
}
