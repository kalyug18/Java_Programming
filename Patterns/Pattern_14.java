A
AB
ABC
ABCD
ABCDE

class Solution {
    			
    public void pattern1(int N) {
      
        
        for (int i = 0; i < N; i++) {
           
            for (char j = 'A'; j <= 'A' + i ; j++) 
            {
                System.out.print(j);
                
                
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
