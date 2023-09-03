import java.lang.Math;

public class Circle extends Shape {
    double radius;

    public Circle(double radius, String name, String color) {
        super(name, color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
