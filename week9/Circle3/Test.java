package week9.Circle3;

public class Test {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle2 objects is " + Circle.numberOfObjects);

        // Create object c1
        Circle c1 = new Circle();

        // Display c1 before c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius = " + c1.radius + " and number of Circle objects = " + c1.numberOfObjects);

        // Create c2
        Circle c2 = new Circle(5);

        // Modify c1
        c1.radius = 9;

        // Display c1 and c2 after c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius = " + c1.radius + " and number of Circle objects = " + c1.numberOfObjects);
        System.out.println("c2: radius = " + c2.radius + " and number of Circle objects = " + c2.numberOfObjects);
    }
}
