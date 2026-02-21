public class ExceptionPropagation {

    public static void methodB() {
        // This triggers the exception
        int result = 10 / 0; 
        System.out.println("This will never print.");
    }

    public static void methodA() {
        // methodA calls methodB but doesn't have a try-catch
        methodB();
        System.out.println("Method A finished.");
    }

    public static void main(String[] args) {
        try {
            // main starts the chain
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
