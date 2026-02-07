4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 



class Solution {
    			
   public void pattern1(int N) {
     
    int size = 2 * N - 1; 
    
    for (int i = 0; i < size; i++) {
      
        for (int j = 0; j < size; j++) 
        
        {
            
            // Calculate distance to all four edges
            int top = i;
            int left = j;
            int bottom = (size - 1) - i;
            int right = (size - 1) - j;
            
            // The value is N minus the minimum distance to any edge
            int value = N - Math.min(Math.min(top, bottom), Math.min(left, right));
            System.out.print(value + " ");
        }
        
        System.out.println();
    }
    }
        
    
    
 public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 4; 
        sol.pattern1(N); 
    }
}
