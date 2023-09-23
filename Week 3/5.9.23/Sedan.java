public class Sedan extends Car {

  int discount;
  int carID;

  public Sedan(
    String brand,
    String color,
    int year,
    int price,
    int carID,
    int discount
  ) {
    super(brand, color, year, price, carID);
    this.discount = discount;
  }

  public Sedan(String brand, String color, int year, int price, int carID) {
    super(brand, color, year, price, carID);
    this.discount = 0;
  }
  public void showCarInformation() {
    System.out.println("Sedan");
    System.out.printf("Car brand:         %s%n", super.brand);
    System.out.printf("Car color:         %s%n", super.color);
    System.out.printf("Made in year:      %s%n", super.year);
    System.out.printf("Car price:         %s%n", super.price+"$");
    System.out.printf("Car ID:            %s%n", this.carID);
    System.out.printf("Car discount:      %s%n", this.discount+"$\n");
}

}
