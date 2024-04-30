package Sanjay.Topics.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingReader {
    public static void main(String[] args) {
        String fileName = "java.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char) read);
            } while (read != -1);
        } catch (FileNotFoundException e) {
            System.out.printf("%s not found", fileName);
        } catch (IOException e) {
            System.out.printf("Exception orrcured: %s", e.getMessage());
        }
    }
}
