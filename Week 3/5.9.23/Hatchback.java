public class Hatchback extends Car {
    int discount;

    public Hatchback(String brand, String color, int year, int price, int carID, int discount) {
        super(brand, color, year, price, carID);
        this.discount = discount;
    }

    public void showCarInformation() {
        System.out.println("Car brand:                      " + this.brand);
        System.out.println("Car color:                        " + this.color);
        System.out.println("Made in year:   " + this.year);
        System.out.println("Car price:                   " + this.price + "$");
        System.out.println("Car ID:                   " + this.ID);
        System.out.println("Car discount:                   " + this.discount + "%");
    }

}
