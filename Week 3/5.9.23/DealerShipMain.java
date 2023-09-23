import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.SwingConstants;

public class DealerShipMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        float balance = 100000.0f;
        ArrayList<Car> cars = new ArrayList<Car>();
        while (true) {
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

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
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
}


//this is a comment