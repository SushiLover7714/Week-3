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
        String filePath = ".\\Example3.txt";
        
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            while (true) {
                System.out.print("Enter a string (Type 'q' to quit): ");
                userInput = input.nextLine();
                if ("q".equals(userInput)) {
                    break; // Exit the loop if the user inputs 'q'
                }
                userInputs.add(userInput);
            }

            for (String line : userInputs) {
                writer.write(line);
                writer.newLine(); // Add a newline after each string
            }

            System.out.println("User input has been written to the file.");

            // Close the writer and the input scanner in a finally block
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            input.close();
        }
    }
}
