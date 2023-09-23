import java.util.ArrayList;

public class Customer {
    String name;
    private String ID;
    ArrayList<Car> cars = new ArrayList<Car>();
    private float balance;

    public Customer(String name, String ID, int numCar, float balance) {
        this.name = name;
        this.ID = ID;
        this.balance = balance;

    }

    public void showCustomerInformation() {

        System.out.println("Customer name:                      " + this.name);
        System.out.println("Customer ID:                        " + this.ID);
        System.out.println("Number of cars owned by customer:   " + cars.size());
        System.out.println("Customer balance:                   " + this.balance + "$");

    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void setCustomerID(String ID) {
        this.ID = ID;
    }

    public String getCustomerID() {
        return this.ID;
    }
}
