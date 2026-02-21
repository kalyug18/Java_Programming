import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        // Resources are declared inside the parentheses ()
        try (FileInputStream in = new FileInputStream("input.txt");FileOutputStream out = new FileOutputStream("output.txt"))
          {            
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
        // No finally block needed! 'in' and 'out' are automatically closed here.
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; // Required for Scanner

public class FileCopyExample {
    public static void main(String[] args) {
        
        // Correct Syntax: try (Resource declaration) { ... }
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        // scanner is automatically closed here!
    }
}
