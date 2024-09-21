//SHAPE INTERFACE
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

//ABSTACT SHAPE CLASS
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    // Constructor to initialize common attributes
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Methods to be implemented by the subclasses
    @Override
    public abstract double calculateArea();

    @Override
    public abstract double calculatePerimeter();
}

//CIRCLE CLASS
class Circle extends AbstractShape {
    double radius;

    // Constructor for Circle class
    public Circle(String color, double radius) {
        super(color, radius, 0); // No width for a circle, so we pass 0
        this.radius = radius;
    }

    // Implement the calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement the calculatePerimeter method
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

//RECTANGLE CLASS
class Rectangle extends AbstractShape {

    // Constructor for Rectangle class
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    // Implement the calculateArea method
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implement the calculatePerimeter method
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

//MAIN CLASS
public class tasksheet128 {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Circle (Color: " + circle.color + ")");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        System.out.println("\nRectangle (Color: " + rectangle.color + ")");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}