import java.util.*;

class Solution { // <--- Class starts here
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
       int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        
        int sL = sol.slargest(n, arr);
        int sS = sol.ssmallest(n, arr);
        
        System.out.println("Second Largest: " + sL);
        System.out.println("Second Smallest: " + sS);
    } 
 

    int slargest(int n, int arr[]) {
        int largest = arr[0];
        int slargest = -1;
      
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }
    
    int ssmallest(int n, int arr[]) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
       
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    
} // <--- MOVE THE BRACE HERE: This closes the "Solution" class
