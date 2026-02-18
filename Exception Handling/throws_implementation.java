//

import java.io.*;

public class ThrowsExample {
    public static void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("nonexistentfile.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
