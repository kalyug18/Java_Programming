public class ValidationExample {
    
    // Method that validates input
    public static void setBalance(double amount) {
        if (amount < 0) {
            // Throwing the exception because the argument is invalid
            throw new IllegalArgumentException("Balance cannot be negative: " + amount);
        }
        System.out.println("Balance successfully set to: $" + amount);
    }

    public static void main(String[] args) {
        double inputAmount = -50.0;

        try {
            System.out.println("Attempting to set balance...");
            setBalance(inputAmount); 
        } catch (IllegalArgumentException e) {
            // Handling the invalid input
            System.out.println("Caught an error: " + e.getMessage());
        }
        finally 
        {
        System.out.println("Program continues...");
        }
    }
}
