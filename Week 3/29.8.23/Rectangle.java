public class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width, String name, String color) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
