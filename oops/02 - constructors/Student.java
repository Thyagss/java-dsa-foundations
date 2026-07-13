package oops;

class Student {

    String name;
    String department;
    int age;
    double cgpa;

    Student() {
        System.out.println("No-Argument Constructor Called");
    }

    // Constructor 1
    Student(String name) {
        this.name = name;
        System.out.println("Constructor 1");
    }

    // Constructor 2
    Student(String name, String department) {
        this(name); // Constructor Chaining
        this.department = department;
        System.out.println("Constructor 2");
    }

    // Constructor 3
    Student(String name, String department, int age, double cgpa) {
        this(name, department); // Constructor Chaining
        this.age = age;
        this.cgpa = cgpa;
        System.out.println("Constructor 3");
    }

    public void displayStudent() {

        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
}
