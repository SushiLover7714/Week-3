public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 1975);
        car1.getVehicleInformation();
    }
}

class Vehicle {
    String brand;
    int year;

    public void getVehicleInformation() {
        System.out.println("Brand name is " + brand);
        System.out.println("The vehicle was made in the year " + year);
    }

}

class Car extends Vehicle {
    public Car(String brand, int year) {
        super.brand = brand;
        super.year = year;
    }
}
