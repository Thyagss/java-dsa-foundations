package oops;

class Student {

    // Instance Variables (State)
    String name;
    String department;
    int age;
    double cgpa;

    
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
