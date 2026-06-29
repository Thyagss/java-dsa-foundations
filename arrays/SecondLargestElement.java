package arrays;

public class SecondLargestElement {

        public static String findSecondLargest(int[] arr) {

            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            if(arr.length < 2) {
                return "Array should have at least two numbers to find the second largest element ";
            }

            for(int i=0; i<arr.length; i++) {
                if(arr[i] > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = arr[i];
                }
                else if(arr[i] > secondLargest && arr[i] != firstLargest) {
                    secondLargest = arr[i];
                }
            }

            return secondLargest + " is the second largest element in an array";
        }

        public static void main(String[] args) {

            int[] arr = {4,9,0,2,8,7,1,18};

            System.out.print(SecondLargestElement.findSecondLargest(arr));
        }
    }
