interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}
class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle("red", 5.0);
        Shape rectangle = new Rectangle("blue", 4.0, 6.0);

        System.out.println("Circle's color: " + ((Circle) circle).color);
        System.out.println("Circle's Area: " + circle.calculateArea());
        System.out.println("Circle's Perimeter: " + circle.calculatePerimeter());
        System.out.println();

        System.out.println("Rectangle's color: " + ((Rectangle) rectangle).color);
        System.out.println("Rectangle's Area: " + rectangle.calculateArea());
        System.out.println("Rectangle's Perimeter: " + rectangle.calculatePerimeter());
    }
}
