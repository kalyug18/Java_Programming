public class NullPointerExample {
    public static void main(String[] args) {
        String myString = null; // This variable points to nothing

        try {
            System.out.println("Attempting to get the length of the string...");
            
            // This will throw a NullPointerException because myString is null
            int length = myString.length(); 
            
            System.out.println("String length is: " + length);

        } catch (NullPointerException e) {
            // Handling the error gracefully
            System.out.println("Error: You tried to perform an operation on a null object!");
            System.out.println("Actual Exception: " + e);
        }

        System.out.println("The program continues to run safely.");
    }
}
