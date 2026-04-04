import java.util.*;

class Solution { // <--- Class starts here
    
    public static void main(String[] args) {
      
      Solution sol = new Solution();
      
       int[] arr = {1, 2, 2, 7, 7};
        int n = arr.length;
        
        int count = sol.uniqueElements(n, arr);
        
        System.out.println("No. of unique elements: " + count);
            } 
    int uniqueElements(int n, int arr[]) {
       
        int i=0;
        for (int j = 1; j < n; j++) {
          
            if (arr[i] != arr[j]) {
            
            arr[i+1]=arr[j];
            i++;
            }
        }
        return i+1;
    }
    
}
