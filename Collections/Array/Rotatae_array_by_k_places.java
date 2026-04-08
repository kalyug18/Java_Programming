import java.util.Arrays;

class ArrayRotation {     
    public static void main(String[] args) {     
    
       int[] arr = {1, 2, 3, 4, 5 ,6,7};
       int d=3;
        int n = arr.length;
       
        int tmp[]={1,2,3};
      
        for (int i = d; i < n; i++) {
             arr[i-d]=arr[i];          
            }           
      
           for (int i=n-d;i<n;i++)
           {
             arr[i]=tmp[i-(n-d)];
           }         
           
            System.out.println("New array is:" +Arrays.toString(arr));        
    }
  }
