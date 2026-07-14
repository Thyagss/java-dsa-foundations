public class EncapsulationDemo {
    public static void main(String[] args) {
        
        Student obj = new Student();
        
		    // Valid Inputs
		    obj.setName("Thyags");
        obj.setAge(23);
        obj.setCGPA(8.25);
        
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("CGPA: " + obj.getCGPA());
        System.out.println();
        
		    // Invalid Inputs
		    obj.setAge(-5);
        obj.setCgpa(12.5);
        obj.setName("");

    }
}
