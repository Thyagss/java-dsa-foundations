package oops;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Thyags";
        student1.department = "CSE";
        student1.age = 22;
        student1.cgpa = 8.25;

        System.out.println("Using No-Argument Constructor");
        student1.study();
        student1.attendClass();
        student1.writeExam();

        Student student2 = new Student("Karthy", "CSE", 23, 8.25 );

        System.out.println("Using Parameterized Constructor");
        student2.study();
        student2.attendClass();
        student2.writeExam();
        
    }
}
