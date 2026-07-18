class Person {

    void work() {
        System.out.println("Person is working.");
    }
}

class Student extends Person {

    void work() {
        System.out.println("Student is studying.");
    }

    void attendClass() {
        System.out.println("Student is attending class.");
    }
}

public class Main {

    public static void main(String[] args) {

        // Upcasting
        Person person = new Student();

        person.work();
        person.attendClass(); // Gives compilation error since it is not found in superclass.
    }
}
