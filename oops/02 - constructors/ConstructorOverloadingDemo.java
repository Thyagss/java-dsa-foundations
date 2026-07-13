package oops;

public class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Thyags");
        Student student3 = new Student("Thyags", "CSE");
        Student student4 = new Student("Thyags", "CSE", 22, 8.25);

        student2.displayStudent();
        student3.displayStudent();
        student4.displayStudent();
    }
}
