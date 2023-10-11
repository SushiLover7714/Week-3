import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserInputToFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filePath = "C:\\Users\\msi\\Desktop\\Core Java\\Week 3\\11.10.23\\Example2.txt";
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(userInput);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
