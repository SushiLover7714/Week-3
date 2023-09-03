public class CalculateAreaMain {
    public static void main(String[] args) {
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

    }
    public void addShape(Shape shape, Shape[]shapeArr){
Shape[] tempArr = new Shape[shapeArr.length+1];
for(int i=0;i<shapeArr.length;i++){
    tempArr[i] = shapeArr[i];

}
tempArr[tempArr.length-1] = shape;

    }
}

