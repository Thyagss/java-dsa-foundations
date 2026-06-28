package arrays;

public class TwoSum {

    public static String findTarget(int[] arr, int target) {

        int left = 0;
        int right = arr.length-1;

        int current = 0;

        while(left < right) {
            current = arr[left] + arr[right];

            if(current == target) {
                return arr[left] + " " + arr[right];
            }
            else if(current < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return "No matching pair found";
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int target = 5;

        System.out.println(findTarget(arr, target));

    }
}
