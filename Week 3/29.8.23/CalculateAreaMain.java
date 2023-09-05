import java.util.Scanner;

public class CalculateAreaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String color;
        Shape[] shapeArr = new Shape[3];
        shapeArr[0] = new Circle(20, "Circle", "blue");
        shapeArr[1] = new Rectangle(30, 15, "Rectangle", "Red");
        shapeArr[2] = new Triangle(17, 5, "Triangle", "Pink");
        try {
            for (int i = 0; i < shapeArr.length; i++) {
                System.out.println("Shape: " + shapeArr[i].name + ", Color: " + shapeArr[i].color + ", Area: "
                        + shapeArr[i].calculateArea());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.print("Enter Shape(1.Circle,2.Rectangle,3.Triangle): ");
        int option = input.nextInt();
        input.nextLine();
        System.out.print("Enter colour: ");
        color = input.nextLine();
        switch (option) {
            case 1:
                System.out.print("Enter radius: ");
                int radius = input.nextInt();
                Shape circle = new Circle(radius, "Circle", color);
                shapeArr = addShape(circle, shapeArr);
                break;

            case 2:
                System.out.print("Enter length: ");
                int length = input.nextInt();
                System.out.print("Enter width: ");
                int width = input.nextInt();
                Shape rectangle = new Rectangle(length, width, "Rectangle", color);
                shapeArr = addShape(rectangle, shapeArr);
                break;

            case 3:
                System.out.print("Enter base: ");
                int base = input.nextInt();
                System.out.print("Enter height: ");
                int height = input.nextInt();
                Shape triangle = new Triangle(base, height, "Triangle", color);
                shapeArr = addShape(triangle, shapeArr);
                break;

        }
        System.out.println(shapeArr.length);

        try {
            for (int i = 0; i < shapeArr.length; i++) {
                System.out.println("Shape: " + shapeArr[i].name + ", Color: " + shapeArr[i].color + ", Area: "
                        + shapeArr[i].calculateArea());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static Shape[] addShape(Shape shape, Shape[] shapeArr) {
        Shape[] tempArr = new Shape[shapeArr.length + 1];
        for (int i = 0; i < shapeArr.length; i++) {
            tempArr[i] = shapeArr[i];

        }
        tempArr[tempArr.length - 1] = shape;
        shapeArr = tempArr;
        return shapeArr;
    }
}
