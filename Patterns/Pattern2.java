* 
* * 
* * * 
* * * * 
* * * * *

class Solution {
    			
    public void pattern1(int N) {
        
        for (int i = 0; i <= N-1; i++) {
            
            for (int j = 0; j <= i; j++) 
            
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5; 
        sol.pattern1(N); 
    }
}

