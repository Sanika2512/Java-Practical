import java.util.*;
interface Shape {
    void area(); 
}
class Rectangle implements Shape {
    private double length, breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void area() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle implements Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }
}


public class ShapeTest {
    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.area();

        Triangle triangle = new Triangle(6, 8);
        triangle.area();
    }
}
