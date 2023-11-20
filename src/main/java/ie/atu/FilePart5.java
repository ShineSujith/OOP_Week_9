package ie.atu;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class FilePart5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of file to open:\n");
        String file = scanner.nextLine();
        try {
            Scanner inputFile = new Scanner(new File(file));
            while (inputFile.hasNext()) {
                String str = inputFile.nextLine();
                System.out.println(str);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
