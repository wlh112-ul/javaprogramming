package week9.Point2D;

public class Point2D {
    private double x;
    private double y;

    // Constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Calculate distance between this point and another point
    public double distance(Point2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Calculate the midpoint between this point and another point.
    public Point2D midpoint(Point2D other) {
        double midX = (this.x + other.x) / 2.0;
        double midY = (this.y + other.y) / 2.0;
        return new Point2D(midX, midY);
    }

    // Override toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
