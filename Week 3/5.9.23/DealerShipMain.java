import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DealerShipMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        float balance = 100000.0f;
        ArrayList<Car> cars = new ArrayList<Car>();

        while (true) {
            try {
                System.out.println("pos for car dealership: ");
                System.out.println("-------------------------------");
                System.out.println("1.Add customer: ");
                System.out.println("2.Show Cars information: ");
                System.out.println("3.Sell car");
                System.out.println("4.Buy car: ");
                System.out.println("5.Add car");
                System.out.println("6.Exit");
                System.out.println("-------------------------------");
                System.out.print("Enter option: ");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        boolean addCustomerSuccessfully = addCustomerInfo(input, customers);
                        if (addCustomerSuccessfully == false) {
                            continue;
                        }
                        System.out.println("Added customer successfully");
                        break;

                    case 2:
                        showCarInformation(cars);
                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:
                        addCar(input, cars);
                        break;

                    case 6:
                        System.exit(0);
                        break;

                    default:
                        break;
                }

            } catch (Exception e) {
                System.out.println("Input valid option");
                break;
            }

        }
    }

    public static boolean addCustomerInfo(Scanner input, ArrayList<Customer> customers) {
        boolean addCustomerSuccessfully;
        try {
            input.nextLine();
            System.out.print("Enter name of customer: ");
            String name = input.nextLine();
            System.out.print("Enter ID of customer: ");
            String ID = input.nextLine();
            System.out.print("Enter total number of cars by customer: ");
            int numCar = input.nextInt();
            System.out.print("Enter balance of customer: ");
            float balance = input.nextFloat();
            Customer customer = new Customer(name, ID, numCar, balance);
            customers.add(customer);
            addCustomerSuccessfully = true;
        } catch (InputMismatchException e) {
            System.out.println("Test");
            addCustomerSuccessfully = false;
        }
        return addCustomerSuccessfully;
    }

    public static void showCarInformation(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).showCarInformation();

        }
    }

    public static void addCar(Scanner input, ArrayList<Car> cars) {
        input.nextLine();
        String carCategory;
        String brand;
        String color;
        int year;
        int price;
        int carID;
        System.out.print("Enter car category(Hatchback,Sedan,SportCar,SUV): ");
        carCategory = input.nextLine();
        System.out.print("Enter car brand: ");
        brand = input.nextLine();
        System.out.print("Enter color of car: ");
        color = input.nextLine();
        System.out.print("Enter the year the car was made: ");
        year = input.nextInt();
        System.out.print("Enter price of car: ");
        price = input.nextInt();
        System.out.print("Enter car ID: ");
        carID = input.nextInt();
        if (carCategory.equalsIgnoreCase("hatchback")) {
            Car car = new Hatchback(brand, color, year, price, carID);
            cars.add(car);
        } else if (carCategory.equalsIgnoreCase("sedan")) {
            Car car = new Hatchback(brand, color, year, price, carID);
            cars.add(car);
        } else if (carCategory.equalsIgnoreCase("sportcar")) {
            Car car = new Hatchback(brand, color, year, price, carID);
            cars.add(car);
        } else if (carCategory.equalsIgnoreCase("suv")) {
            Car car = new Hatchback(brand, color, year, price, carID);
            cars.add(car);
        } else {
            System.out.println("Invalid Car Category!");
        }
    }
}
