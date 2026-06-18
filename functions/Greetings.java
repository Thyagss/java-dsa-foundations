/*

METHODS IN JAVA

Concepts Covered:

* Method with Parameters
* Method with Return Value
* Static Method
* Instance (Non-Static) Method
* Boolean Returning Method
* Method Calling Another Method

Notes:

* Static methods belong to the class and can be called without creating an object.
* Instance methods belong to an object and require object creation.
* Methods improve code reusability and readability by avoiding repetition.
* Return values allow methods to send results back to the caller.
* Boolean methods answer yes/no questions and are commonly used inside conditions.
* Methods can invoke other methods to break large problems into smaller tasks.

Expected Output:

Hello, y'all, Welcome to the World!
My Name is Karthik
My score is 89.9
Studied from Sathyabama
Hello, Thyags
The movie name is: Interstellar
Addition of two numbers: 30
Square value of the number: 64
Can Vote: true
Is Even: false
Odd

*/

package functions;

public class Greetings {

    // Static method (no parameters, no return value)
    public static void greeting() {
        System.out.println("Hello, y'all, Welcome to the World!");
    }

    // Instance methods
    public void showName() {
        System.out.println("My Name is Karthik");
    }

    public void showScore() {
        System.out.println("My score is 89.9");
    }

    public void showCollege() {
        System.out.println("Studied from Sathyabama");
    }

    // Methods with parameters
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public void movieName(String movie) {
        System.out.println("The movie name is: " + movie);
    }

    // Methods with return values
    public static int add(int a, int b) {
        return a + b;
    }

    public static int printSquare(int num) {
        return num * num;
    }

    // Boolean returning methods
    public boolean canVote(int age) {
        return age >= 18;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method calling another method
    public void checkNumber(int number) {
        if (isEven(number)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        Greetings obj = new Greetings();

        // Static Method (Without Parameter & Without Return Value)
        greeting();

        // Instance Methods (Without Parameter & Without Return Value)
        obj.showName();
        obj.showScore();
        obj.showCollege();

        // Methods with Parameters
        obj.greet("Thyags");
        obj.movieName("Interstellar");

        // Methods with Return Values
        System.out.println("Addition of two numbers: " + add(20, 10));
        System.out.println("Square value of the number: " + printSquare(8));

        // Boolean Returning Methods
        System.out.println("Can Vote: " + obj.canVote(18));
        System.out.println("Is Even: " + obj.isEven(91));

        // Method Calling Another Method
        obj.checkNumber(91);
    }

}
