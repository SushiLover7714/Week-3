import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileToArrayList {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\msi\\Desktop\\Core Java\\Week 3\\11.10.23\\Example.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader);
            ArrayList<String> lines = new ArrayList<String>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
