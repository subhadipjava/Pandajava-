class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}


class Circle {
    private double radius;
    private Point center;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.center = new Point(x, y);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        center.display();
        System.out.println("Area: " + getArea());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(4.5, 1.0, 2.0);
        c1.display();
    }
}