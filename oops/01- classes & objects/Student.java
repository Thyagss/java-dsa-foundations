package oops;

class Student {

    // Instance Variables (State)
    String name;
    String department;
    int age;
    double cgpa;

    // No-Args Constructor
    Student() {
        System.out.println("Student Object Created!");
    }

    // Parameterized Constructor
    Student(String name, String department, int age, double cgpa) {

    this.name = name;
    this.department = department;
    this.age = age;
    this.cgpa = cgpa;

    System.out.println("Student Object Created using Parameterized Constructor!");
    }
    
    // Behaviours
    void study() {
        System.out.println(name + " is studying.");
    }

    void attendClass() {
        System.out.println(name + " is attending class.");
    }

    void writeExam() {
        System.out.println(name + " is writing the exam.");
    }
}
