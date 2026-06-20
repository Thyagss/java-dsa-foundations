package arrays;

public class ArrayOperations {

    // Sum of Array Elements
    public void sumArray() {

        int[] arr = {93,74,59,69,77,103,556,92,222,555,1,2,3,4,5,5,6,7};
        int total = 0;

        for(int i=0; i<arr.length; i++) {
            total += arr[i];
        }

        System.out.println("The sum is: " + total);
    }

    // Average of Array Elements
    public void averageArray() {

        int[] arr = {93,74,59,69,77,103,556,92,222,555,1,2,3,4,5,5,6,7};
        int total = 0;

        for(int i=0; i<arr.length; i++) {
            total += arr[i];
        }

        double average = (double) total / arr.length;
        System.out.println("The average is: " + average);
    }

    //Product of all Elements
    public void productArray() {

        int[] arr = {93,74,59,69,77};
        long product = arr[0];

        for(int i=1; i<arr.length; i++) {
            product = product * arr[i];
        }

        System.out.println("The product is: " + product);
    }

    // Absolute Sum of all elements
    public void absSum() {

        int[] arr = {-93, 74, -59, 69, -77};
        int absoluteSum = 0;

        for(int i=0; i<arr.length; i++)
        {
            absoluteSum += Math.abs(arr[i]);
        }

        System.out.println("The absolute sum is: " + absoluteSum);
    }

    // Sum from Start to Middle
    public void sumStoM() {

        int[] arr = {93,74,59,69,77,45};
        int total = 0;

        for(int i=0; i<arr.length/2; i++) {
            total += arr[i];
        }

        System.out.println("Sum from Start to Middle: " + total);

    }

    // Sum from Middle to End
    public void sumMtoE() {

        int[] arr = {93,74,59,69,77,45};
        int total = 0;

        for(int i=arr.length/2; i<arr.length; i++) {
            total += arr[i];
        }

        System.out.println("Sum of Middle to End: " + total);
    }

    // Product from Start to Middle
    public void productStoM() {

        int[] arr = {93,74,59,69,77,45};
        long product = arr[0];

        for(int i=1; i<arr.length/2; i++) {
            product *= arr[i];
        }

        System.out.println("Product of Start to Middle: " + product);
    }

    // Product from Middle to End
    public void productMtoE() {

        int[] arr = {93,74,59,69,77,45};
        long product = 1;

        for(int i=arr.length/2; i<arr.length; i++) {
            product *= arr[i];
        }

        System.out.println("Product of Middle to End: " + product);
    }

    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations();

        obj.sumArray();
        obj.averageArray();
        obj.productArray();
        obj.absSum();
        obj.sumStoM();
        obj.sumMtoE();
        obj.productStoM();
        obj.productMtoE();

    }
}
