package Sanjay.Topics.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingV2 {
    public static void main(String[] args) {
        String filename = "java.txt";

        try (FileWriter writer = new FileWriter(filename);) {
            writer.write("This is test file.");
            writer.flush();
            System.out.println("File Written Successfully");
        } catch (IOException e) {
            System.out.printf("Exception occured %s\n", e);
        }
    }
}
