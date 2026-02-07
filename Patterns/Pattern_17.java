    A    
   ABA   
  ABCBA  
 ABCDCBA 

class Solution {
    			
    public void pattern1(int N) {
      
          
        for (int i = 0; i < N; i++) {
          
          
            for (int j = 0; j <N-i ; j++) 
            {
                System.out.print(' ');
            }
            
            char ch='A';
            int bp= (2*i+1)/2;
            for ( int j = 1; j <= 2*i + 1 ;j++) 
            {
                
                System.out.print(ch);
                if (j <=bp )
                {  
                  ch++;
                }
                
                else 
                {
                  ch--;
                }
                
            }
            
            for (int j = 0; j <N-i ; j++) 
            {
                System.out.print(' ');
            }
            
           
               System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        int N = 4; 
        sol.pattern1(N); 
    }
}
