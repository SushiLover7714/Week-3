public class Customer {
    String name;
    String ID;
    Car[] cars;
    private float balance;

    public Customer(String name, String ID, int numCar, float balance) {
        this.name = name;
        this.ID = ID;
        cars = new Car[numCar];
        this.balance = balance;
    }

    public void showCustomerInformation() {

        System.out.println("Customer name:                      " + this.name);
        System.out.println("Customer ID:                        " + this.ID);
        System.out.println("Number of cars owned by customer:   " + 1);
        System.out.println("Customer balance:                   " + this.balance + "$");

    }
}
