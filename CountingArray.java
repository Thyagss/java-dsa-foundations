package arrays;

public class CountingArray {

    // Count Even Numbers
    public void countEven() {

        int[] arr = {12,6,3,1,14,60};
        int count = 0;

        for(int i=0; i<arr.length; i++) {

            if(arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of Even Num: " + count);
    }

    //Count Odd Numbers
    public void countOdd() {

        int[] arr = {12,6,3,1,12,60};
        int count = 0;

        for(int i=0; i<arr.length; i++) {

            if(arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Count of Odd Num: " + count);
    }

    // Count Positive Numbers
    public void countPositive() {

        int[] arr = {12,6,3,-1,-33,-21,-15};
        int count = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>0) {
                count++;
            }
        }
        System.out.println("Count of +ve num: " + count);
    }

    // Count Negative Numbers
    public void countNegative() {

        int[] arr = {12,6,3,-1,-33,-21,-15,-12};
        int count = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<0) {
                count++;
            }
        }
        System.out.println("Count of -ve num: " + count);
    }

    // Largest Element
    public void largestElement() {

        int[] arr = {12,6,3,-1,-33,-21,-15,-12};
        int largest = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest Element in an Array: " + largest);
    }

    // Smallest ELement
    public void smallestElement() {

        int[] arr = {12,6,3,-1,-33,-21,-15,-12};
        int smallest = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest Element in an Array: " + smallest);
    }

    public static void main(String[] args) {
        CountingArray obj = new CountingArray();

        obj.countEven();
        obj.countOdd();
        obj.countPositive();
        obj.countNegative();
        obj.largestElement();
        obj.smallestElement();

    }
}
