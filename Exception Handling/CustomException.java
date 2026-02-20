// Checked Exception (extends Exception)
 class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message); 
    }
}

 public class ThrowExample {
    // FIX: Added 'throws InvalidAgeException' to the signature
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(98);
        } catch (InvalidAgeException e) {
            // FIX: Print the message so you can see it in the console
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("tata byyeeeee..");
        }
    }
}
