/*

This one is the optimized version of the brute-force GreatestCommonDivisor program using the Euclidean Algorithm.

Euclidean Algorithm: GCD(a, b) = GCD(a - b, b)
  
Repeat until one number becomes 0. The other number is the GCD.
 
Note: '%' gives the same result as repeated subtraction in a single operation, making the algorithm much faster.

*/

package basic;

public class optimalGCD {

    public int euclideanGCD(int num1, int num2) {

        while(num1 > 0 && num2 > 0) {

            if(num1 > num2) {
                num1 = num1 % num2;
            }
            else {
                num2 = num2 % num1;
            }
        }

        if(num1 == 0) {
            return num2;
        } else {
            return num1;
        }
    }

    public static void main(String[] args) {

        optimalGCD obj = new optimalGCD();

        int num1 = 52, num2 = 10;
        System.out.println("GCD is: " + obj.euclideanGCD(num1, num2));
    }

}
