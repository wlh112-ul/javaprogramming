package student;

public class Test {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", 20);

        // Access data using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Modify data using setters
        student.setName("Bob");
        student.setAge(25);

        // Attempt to set an invalid age
        student.setAge(-5); // Prints "Invalid age!"

        // Access modified data
        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }
}
