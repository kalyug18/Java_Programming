//Write a program to catch an ArithmeticException (e.g., division by zero) and display an appropriate message.

public class ArithmeticE {
   
    public static void main(String[] args) {
        try {
            double d=8/0;
          System.out.println(d);
          
        } catch (ArithmeticException e) {
           System.out.println ("Division not possible");
            System.out.println("Exception message: " + e.getMessage());
        }
        finally 
        {
          System.out.println("tata byyeeeee..");
        }
    }
}
