public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote "); //This creates a new instance of the built-in ArithmeticException class
                                                                        //and attaches your custom message to it.
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {  //This is the "safety net." It catches the ArithmeticException object thrown by the checkAge method and gives it the variable name e.
            e.printStackTrace(); //This is a very useful debugging tool. It prints the exception name, your message ("Not eligible to vote."), 
                                  //and the exact line numbers where the error occurred.
        }
    }
}
