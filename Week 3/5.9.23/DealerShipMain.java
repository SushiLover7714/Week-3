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
        System.out.println("\npos for car dealership: ");
        System.out.println("-------------------------------");
        System.out.println("1.Add customer: ");
        System.out.println("2.Show Cars information: ");
        System.out.println("3.Show customer information: ");
        System.out.println("4.Sell car");
        System.out.println("5.Buy car: ");
        System.out.println("6.Add car");
        System.out.println("7.Exit");
        System.out.println("-------------------------------");
        System.out.print("Enter option: ");
        int option = input.nextInt();
        switch (option) {
          case 1:
            boolean addCustomerSuccessfully = addCustomerInfo(input, customers);
            if (addCustomerSuccessfully == false) {
              continue;
            }
            System.out.println("\nAdded customer successfully");
            break;
          case 2:
            showCarInformation(cars, input, customers);
            break;
          case 3:
            showCustomerInformation(input, customers);
            break;
          case 4:
            sellCar(input, cars, customers);
            break;
          case 5:
            break;
          case 6:
            addCar(input, cars, customers);
            break;
          case 7:
            System.exit(0);
            break;
          default:
            break;
        }
      } catch (Exception e) {
        System.out.println("\nInput valid option\n");
        input.nextLine();
        continue;
      }
    }
  }

  public static boolean addCustomerInfo(
      Scanner input,
      ArrayList<Customer> customers) {
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

  public static void showCarInformation(
      ArrayList<Car> cars,
      Scanner input,
      ArrayList<Customer> customers) {
    input.nextLine();
    System.out.println("1. Show cars in dealership");
    System.out.println("2. Show a customer's cars");
    System.out.print("Enter Option : ");
    int option = input.nextInt();
    if (option == 1) {
      System.out.println("------------Cars in dealership------------");
      for (int i = 0; i < cars.size(); i++) {
        cars.get(i).showCarInformation();
      }
    } else if (option == 2) {
      input.nextLine();
      System.out.print("Enter Customer ID : ");
      String customerID = input.nextLine();
      int index = getCustomerIndexByID(customerID, customers);
      if (index != -1) {
        System.out.println(
            "------------Customer " + customerID + "'s cars------------");
        customers.get(index).showCustomerCarInformation();
      } else {
        System.out.println("\nInvalid Customer ID");
      }
    }
  }

  public static void addCar(
      Scanner input,
      ArrayList<Car> cars,
      ArrayList<Customer> customers) {
    input.nextLine();
    String carCategory;
    String brand;
    String color;
    int year;
    int price;
    String carID = "";
    int option;
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
    input.nextLine();
    System.out.print("Enter car ID: ");
    carID = input.nextLine();
    System.out.println("1.Add car to dealership");
    System.out.println("2.Add car to customer");
    System.out.print("Enter option: ");
    option = input.nextInt();
    if (option == 1) {
      if (carCategory.equalsIgnoreCase("hatchback")) {
        Car car = new Hatchback(brand, color, year, price, carID);
        cars.add(car);
      } else if (carCategory.equalsIgnoreCase("sedan")) {
        Car car = new Sedan(brand, color, year, price, carID);
        cars.add(car);
      } else if (carCategory.equalsIgnoreCase("sportcar")) {
        Car car = new SportCar(brand, color, year, price, carID);
        cars.add(car);
      } else if (carCategory.equalsIgnoreCase("suv")) {
        Car car = new SUV(brand, color, year, price, carID);
        cars.add(car);
      } else {
        System.out.println("Invalid Car Category!");
      }
    } else if (option == 2) {
      String customerID;
      input.nextLine();
      System.out.print("Enter customer ID: ");
      customerID = input.nextLine();
      int index = getCustomerIndexByID(customerID, customers);
      if (carCategory.equalsIgnoreCase("hatchback")) {
        Car car = new Hatchback(brand, color, year, price, carID);
        customers.get(index).addCar(car);
      } else if (carCategory.equalsIgnoreCase("sedan")) {
        Car car = new Sedan(brand, color, year, price, carID);
        customers.get(index).addCar(car);
      } else if (carCategory.equalsIgnoreCase("sportcar")) {
        Car car = new SportCar(brand, color, year, price, carID);
        customers.get(index).addCar(car);
      } else if (carCategory.equalsIgnoreCase("suv")) {
        Car car = new SUV(brand, color, year, price, carID);
        customers.get(index).addCar(car);
      } else {
        System.out.println("Invalid Car Category!");
      }
    }
  }

  public static int getCustomerIndexByID(
      String ID,
      ArrayList<Customer> customers) {
    for (int i = 0; i < customers.size(); i++) {
      if (ID.equals(customers.get(i).getCustomerID())) {
        return i;
      }
    }
    return -1;
  }

  public static void showCustomerInformation(
      Scanner input,
      ArrayList<Customer> customers) {
    input.nextLine();
    int option;
    String customerID;
    System.out.println("1. Show a customer infromation");
    System.out.println("2. Show all customer information");
    System.out.println("Enter option: ");
    option = input.nextInt();
    if (option == 1) {
      input.nextLine();
      System.out.print("Enter customer ID: ");
      customerID = input.nextLine();
      int index = getCustomerIndexByID(customerID, customers);
      customers.get(index).showCustomerInformation();
    } else if (option == 2) {
      for (int i = 0; i < customers.size(); i++) {
        customers.get(i).showCustomerInformation();
      }
    }
  }

  public static void sellCar(
      Scanner input,
      ArrayList<Car> cars,
      ArrayList<Customer> customers) {
    input.nextLine();
    int carPrice;
    String customerID;
    String carID;
    int option;
    int customerIndex;
    String otherCustomerID;

    System.out.print("Enter customer ID");
    customerID = input.nextLine();
    System.out.print("Enter car ID: ");
    carID = input.nextLine();
    System.out.println("1.Sell to external customer ");
    System.out.println("2.Sell to existing customer ");
    System.out.println("3.Sell to dealership ");
    System.out.print("Enter option: ");
    option = input.nextInt();
    switch (option) {
      case 1:
        // get customerIndex and car price first
        customerIndex = getCustomerIndexByID(customerID, customers);
        carPrice = customers.get(customerIndex).getCar(carID).getPrice();
        // remove car later
        customers.get(customerIndex).removeCar(carID);
        // update balance
        customers.get(customerIndex).updateBalance(1, carPrice);

        break;
      case 2:
        if (customers.size() < 2) {
          System.out.println("There is only one customer");
          break;
        } else {
          input.nextLine();
          System.out.print("Enter customer ID of the buyer: ");
          otherCustomerID = input.nextLine();
          int otherCustomerIndex = getCustomerIndexByID(otherCustomerID, customers);
          customerIndex = getCustomerIndexByID(customerID, customers);
          if (customers.get(otherCustomerIndex).getBalance() >= customers.get(customerIndex).getCar(carID).getPrice()) {
            carPrice = customers.get(customerIndex).getCar(carID).getPrice();
            Car car = customers.get(customerIndex).getCar(carID);
            customers.get(customerIndex).removeCar(carID);
            customers.get(customerIndex).updateBalance(1, carPrice);

            customers.get(otherCustomerIndex).addCar(car);
            customers.get(otherCustomerIndex).updateBalance(2, carPrice);
          }

          else {
            System.out.println("Customer " + otherCustomerID + " Does not have enough balance");

          }
        }
        break;
      default:
        break;
    }
  }
}
