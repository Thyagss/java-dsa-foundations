package arrays;

public class ThirdLargestElement {

        public static String findThirdLargest(int[] arr) {

            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            int thirdLargest = Integer.MIN_VALUE;


            for(int i=0; i<arr.length; i++) {

                if(arr[i] > firstLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = firstLargest;
                    firstLargest = arr[i];
                }

                else if(arr[i] < firstLargest && arr[i] > secondLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = arr[i];
                }

                else if(arr[i] < secondLargest && arr[i] > thirdLargest) {
                    thirdLargest = arr[i];
                }

            }

            return thirdLargest + " is the third largest element in an array";

        }

        public static void main(String[] args) {
            int[] arr = {0, 3, 5, 2, 7, 9, 6,10,11};
            System.out.print(ThirdLargestElement.findThirdLargest(arr));
        }
    }
