public class SportCar extends Car {
    int discount;
    int carID;

    public SportCar(String brand, String color, int year, int price, int carID, int discount) {
        super(brand, color, year, price, carID);
        this.discount = discount;
    }

    public void showCarInformation() {
        System.out.println("Car brand:                      " + super.brand);
        System.out.println("Car color:                        " + super.color);
        System.out.println("Made in year:   " + super.year);
        System.out.println("Car price:                   " + super.price + "$");
        System.out.println("Car ID:                   " + this.carID);
        System.out.println("Car discount:                   " + this.discount + "%");
    }
}
