A
BB
CCC
DDDD
EEEEE


class Solution {
    			
    public void pattern1(int N) {
      
          
        for (int i = 0; i < N; i++) {
          
          //char ch='A'+ i;
          char ch = (char) ('A' + i); //explicit casting
          
            for (int j = 0; j <=i ; j++) 
            {
                System.out.print(ch);
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
