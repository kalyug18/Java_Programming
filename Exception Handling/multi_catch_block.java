public class ArithmeticE {
   
    public static void main(String[] args) {
     
        try {
             
            int[] arr = {6,5,4,3};
            double d=8/2;
          System.out.println(d);
          System.out.println(arr[4]);
          
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
        
        catch (NullPointerException e){
          System.out.println(e.getMessage());
        }
        
        catch (ArrayIndexOutOfBoundsException e) {
          System.out.println(e.getMessage());
        }
        
        finally {
          System.out.println("tata byyeeeee..");
        }
    }
}
