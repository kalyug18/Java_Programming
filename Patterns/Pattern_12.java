1      1
12    21
123  321
12344321

class Solution {
    			
    public void pattern1(int N) {
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }

              for (int j=1;j<=2*(N-i);j++)
              {
                System.out.print(' ');
              }
              
               for (int j = i; j >=1; j--) 
            {
                System.out.print(j);
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



