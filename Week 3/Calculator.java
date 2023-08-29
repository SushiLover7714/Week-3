import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2 = 0;
        char operationType;
        System.out.print("Enter num1: ");
        num1 = input.nextInt();
        System.out.print("Enter num2: ");
        num2 = input.nextInt();
        System.out.print("Enter operation type(+ , - , * , /): ");
        operationType = input.next().charAt(0);
        try {
            switch (operationType) {
                case '+':
                    System.out.println("Result is: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result is: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result is: " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Result is: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Operation is invalid");
            }
        } catch (Exception e) {
            System.out.println("Cannot divide by 0");
        } finally {
            System.out.println("Calculation is complete");
        }
    }
}
