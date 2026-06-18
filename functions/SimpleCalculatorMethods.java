package functions;

import java.util.Scanner;

public class SimpleCalculatorMethods {

    public int add(int a, int b){
        return a+b;
    }

    public int subtraction(int a, int b) {
        return a-b;
    }

    public int division(int a, int b) {
        return a/b;
    }

    public int multiplication(int a, int b) {
        return a*b;
    }

    // Method Composition - Method calling another method.
    public void calculator(int a, int b) {
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtraction(a, b));
        System.out.println("Division: " + division(a, b));
        System.out.println("Multiplication: " + multiplication(a, b));
    }

    public static void main(String[] args) {
        SimpleCalculatorMethods obj = new SimpleCalculatorMethods();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        obj.calculator(a,b);
    }

}
