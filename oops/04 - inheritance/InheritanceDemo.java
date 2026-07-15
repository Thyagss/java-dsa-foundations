public class InheritanceDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Thyags";
        student.age = 22;
        student.department = "CSE";

        student.eat(); // overridden method
        student.sleep(); // inherited method
        student.study(); // own method
    }
}

class Person {

    String name;
    int age;

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Student extends Person {

    String department;

    void study() {
        System.out.println(name + " is studying");
    }

    void eat() {
        System.out.println("Who's still eating");
    }
}
