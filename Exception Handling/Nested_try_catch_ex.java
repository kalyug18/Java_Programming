import java.util.Arrays;

public class NestedTryCatchEx {
   
    public static void main(String[] args) {
     
        try {
             
            int[] arr = {6,5,4,3};
           // double d=8/0;
          
          try {
            double d=8/0;
              System.out.println(d);
          }
        catch (ArithmeticException e) {
            System.out.println("Inner:Exception message: " + e.getMessage());
        }
       
            try {
              System.out.println("Inner:Array: " +Arrays.toString(arr));
              System.out.println(arr[5]);
            }
        
        catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Inner AIOBE: " + e.getMessage());
        }
        
          
        }
         catch (NullPointerException e){
           System.out.println ("Outer block exception: " + e.getMessage());
          
        }
        
        catch (Exception e) {
            System.out.println("Caught a general exception.");
        }
        
        finally {
          System.out.println("Outer:tata byyeeeee..");
        }
    }
    }
