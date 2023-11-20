package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) {
        //specify the file name
        String fileName = "File13.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("Some more content for the file");
            System.out.println("Content Successfully added to file");
        } catch (IOException e) {
            System.out.println("An error has occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
