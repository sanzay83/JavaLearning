package Sanjay.BasicJavaCodes;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandeling {
    public static void saman(String filename) throws IOException {
        //File myObj = new File(filename+".txt");
        //myObj.createNewFile();
        try {
            FileWriter myWriter = new FileWriter(filename+ ".txt");
            for(int i=0; i < 6; i++) {
                myWriter.write(i + " Files in Java might be tricky, but it is fun enough!\n");
            }
            myWriter.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }

    }
}
