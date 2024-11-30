package week9.Circle;

public class Circle {
    double radius;

    /* Construct a circle with radius 1 */
    Circle() {
        radius = 1; // First constructor with no argument
    }

    /* Construct a circle with a specified radius */
    Circle(double newRadius) {
        radius = newRadius; // Second constructor with argument
    }

    /* Return the area of this circle */
    double getArea () {
        return radius * radius * Math.PI;
    }

    /* Return the perimeter of this circle */
    double getPerimeter () {
        return 2 * Math.PI * radius;
    }

    /* Set a new radius for this circle */
    void setRadius (double newRadius) {
        radius = newRadius;
    }
}
