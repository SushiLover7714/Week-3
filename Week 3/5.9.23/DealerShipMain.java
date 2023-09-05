import java.util.ArrayList;

public class DealerShipMain {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer customer1 = new Customer("Toby", 1221, 3, 1000.0f);
        customers.add(customer1);
        customers.get(0).showCustomerInformation();
        float balance = 100000.0f;
        ArrayList<Car> cars = new ArrayList<Car>();
        Car car1 = new Hatchback("Toyota Corolla", "Silver", 2010, 3000, 19978, 0);
        cars.add(car1);
        cars.get(0).showCarInformation();
    }
}
