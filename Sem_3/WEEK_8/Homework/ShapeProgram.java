abstract class Shape {
    // Abstract methods
    public abstract double area();
    public abstract double perimeter();

    // Concrete method
    public void displayInfo() {
        System.out.println("This is a shape with measurable area and perimeter.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void showDetails() {
        displayInfo();
        System.out.println("Shape: Circle");
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    public void showDetails() {
        displayInfo();
        System.out.println("Shape: Rectangle");
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

public class ShapeProgram {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.showDetails();

        System.out.println("------------------");

        Rectangle r = new Rectangle(4, 6);
        r.showDetails();
    }
}
