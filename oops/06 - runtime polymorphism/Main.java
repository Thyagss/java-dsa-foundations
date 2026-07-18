class Person {

    void work() {
        System.out.println("Person is working.");
    }
}

class Student extends Person {

    @Override
    void work() {
        System.out.println("Student is studying.");
    }
}

public class Main {

    public static void main(String[] args) {

        // Upcasting
        Person person = new Student();

        // Runtime Polymorphism
        person.work();
    }
}
