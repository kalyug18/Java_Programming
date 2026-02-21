//

import java.io.*;

public class ThrowsExample {
    public static void readFile() throws FileNotFoundException {         //This is a warning sign. It tells Java: "This method might cause a file error. 
                                                                         //I'm not going to fix it here; whoever calls me must handle it." This is known as "ducking" the exception
          
        FileInputStream fis = new FileInputStream("nonexistentfile.txt"); //Since "nonexistentfile.txt" doesn't exist, this line will immediately create (throw) a FileNotFoundException
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
