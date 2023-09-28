import java.util.ArrayList;

public class Customer {
    String name;
    private String ID;
    private ArrayList<Car> cars = new ArrayList<Car>();
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

    public void removeCar(String carID) {
        int index;
        for (index = 0; index < cars.size(); index++) {
            if (cars.get(index).carID.equals(carID)) {
                cars.remove(index);
                break;
            }
        }
    }

    public void setCustomerID(String ID) {
        this.ID = ID;
    }

    public String getCustomerID() {
        return this.ID;
    }

    public void setBalance(float amount) {
        this.balance = amount;
    }

    public float getBalance() {
        return this.balance;
    }

    public void showCustomerCarInformation() {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).showCarInformation();
        }
    }

    public Car getCar(String carID) {
        Car car;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).carID.equals(carID)) {
                car = cars.get(i);
                return car;
            }
        }
        return null;
    }

    public void updateBalance(int addReduceFlag, float amount) {
        // addReduceFlag = 1 > add to balance
        // addReduceFlag 2 > remove from balance
        if (addReduceFlag == 1) {
            this.balance += amount;
        } else if (addReduceFlag == 2) {
            this.balance -= amount;
        }

    }
}
