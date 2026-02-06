1
01
101
0101
10101

class Solution {
    			
    public void pattern1(int N) {
        
        int start;
        for (int i = 0; i < N; i++) {
          
          if ( i%2==0)
                {
                 start =1;
                }
              else 
               start =0;
            
            for (int j = 0; j <=i  ; j++) 
            
            {
                System.out.print(start);
                start=1-start;
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

