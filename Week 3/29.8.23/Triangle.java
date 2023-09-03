public class Triangle extends Shape {
    double base, height;

    public Triangle(double base, double height, String name, String color) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}
