import java.util.Scanner;
import java.util.HashMap;

public class HashMapTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> customerInfo = new HashMap<String, String>();
        System.out.print("Name of customer: ");
        String name = input.nextLine();
        System.out.print("ID of customer: ");
        String ID = input.nextLine();
        System.out.print("Balance of customer: ");
        String balance = input.nextLine();
        customerInfo.put("name", name);
        customerInfo.put("ID", ID);
        customerInfo.put("balance", balance);
        System.out.println(customerInfo);
    }

}
