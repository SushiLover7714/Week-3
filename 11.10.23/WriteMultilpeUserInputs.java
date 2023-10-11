import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class WriteMultilpeUserInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = "";
        ArrayList<String> userInputs = new ArrayList<String>();
        String filePath = "C:\\Users\\msi\\Desktop\\Core Java\\Week 3\\11.10.23\\Example3.txt";
        while (!(userInput.equals("q"))) {
            System.out.print("Enter a string(Type Q to quit): ");
            userInput = input.nextLine();
            userInputs.add(userInput);
        }

        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (int i = 0; i < userInputs.size(); i++) {
                writer.write(userInputs.get(i));
            }
            writer.close();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
