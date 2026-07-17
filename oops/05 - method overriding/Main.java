class Person {

    void work() {
        System.out.println("Person is working.");
    }
}

class Student extends Person {

    // overridden method
    void work() {
        System.out.println("Student is studying.");
    }
}

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.work();
      
        Person studentWorker = new Student();
        studentWorker.work();
    }
}
