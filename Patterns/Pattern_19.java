**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

class Solution {
    			
    public void pattern1(int N) {
      
         
        for (int i = 0; i < N; i++) {
            
            for (int j = 1; j <=N-i ; j++) 
            {
                System.out.print('*');
            }
            
            for (int j = 0; j <2*i ; j++) 
            {
                System.out.print(' ');
            }
            
            
            for (int j = 1; j <=N-i ; j++) 
            {
                System.out.print('*');
            }
               System.out.println();
            }
            
            
        
        for (int i = 0; i < N; i++) {
            
            for (int j = 1; j <=i+1 ; j++) 
            {
                System.out.print('*');
            }
            
            for (int j = 0; j <8-(2*i) ; j++) 
            {
                System.out.print(' ');
            }
            
            
            for (int j = 1; j <=i+1 ; j++) 
            {
                System.out.print('*');
            }
               System.out.println();
        }        
        
    }

    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        int N = 5; 
        sol.pattern1(N); 
    }
}
