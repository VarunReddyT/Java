abstract class Shape {
    // Abstract method
    public abstract double calculateArea();

    // Concrete method
    public void printMessage() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class abstractK {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of the circle: " + circle.calculateArea());
        circle.printMessage();
    }
}
