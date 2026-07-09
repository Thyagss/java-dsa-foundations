package oops;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Thyags";
        student1.department = "CSE";
        student1.age = 22;
        student1.cgpa = 8.25;

        student1.study();
        student1.attendClass();
        student1.writeExam();
    }
}
