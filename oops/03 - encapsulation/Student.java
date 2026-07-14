class Student {

    // Private Fields 
    private String name;
    private int age;
    private double cgpa;

    // Setter + Validation
    public void setAge(int age) {
        if(age >= 18 && age <= 60) {
            this.age = age;
        } else {
            System.out.print("Age should be between 18 and 60");
        }
    }
    
    public void setCGPA(double cgpa) {
        if(cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("CGPA should be btwn 0.0 and 10.0");
        }
    }
    
    public void setName(String name) {
        if(name.isBlank() || name == null) {
             System.out.println("Name field cannot be null or empty");
        } else {
            this.name = name;
        }
     }

     // Getter
	   public String getName() {
        return name;
     }
	
     public int getAge() {
        return age;
     }
    
     public double getCGPA() {
        return cgpa;
     } 
}
