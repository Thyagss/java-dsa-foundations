package basic;

public class GreatestCommonDivisor {

    public static int findGCD(int num1, int num2) {

        int gcd = 1;

        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        
        int num1 = 20, num2 = 15;
        int gcd = GreatestCommonDivisor.findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}
