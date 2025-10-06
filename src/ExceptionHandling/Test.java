package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;




class FileHandler {

    // constructor mein checked exceptionh declare kiya h
public FileHandler(String fileName) throws IOException {
    FileReader fr = new FileReader(fileName); // may throw IOException
 }
}
public class Test {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("data.txt"); // caller handles exception
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
