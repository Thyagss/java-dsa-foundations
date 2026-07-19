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

    void attendClass() {
        System.out.println("Student is attending class.");
    }
}

public class Main {

    public static void main(String[] args) {

        // Upcasting
        Person person = new Student();

        // Downcasting
        Student student = (Student) person;

        student.work();
        student.attendClass();
    }
}
