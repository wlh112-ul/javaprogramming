package week9.Circle3;
public class Circle {
    /* The radius of the circle */
    double radius;

    /* The number of objects created */
    static int numberOfObjects = 0;

    /* Construct a circle withadius 1 */
    Circle () {
        radius = 1;
        numberOfObjects++;
    }

    public Circle(double i) {
        radius = i;
        numberOfObjects++;
    }

    /* Return number of objects */
    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    /* Return the area of this circle */
    double getArea(){
        return radius * radius * Math.PI;
    }
}
