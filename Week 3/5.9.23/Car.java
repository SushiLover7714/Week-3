public abstract class Car {
    String brand;
    String color;
    int year;
    private int price;
    String carID;

    public Car(String brand, String color, int year, int price, String carID) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
        this.carID = carID;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public abstract void showCarInformation();

}
