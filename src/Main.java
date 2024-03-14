import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        replaceText(inputFilePath, outputFilePath, "Nha Trang", "Vũng Tàu");

        System.out.println("Thay thế hoàn thành.");
    }


    private static void replaceText(String inputFilePath, String outputFilePath, String target, String replacement) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //
                line = line.replaceAll(target, replacement);
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
