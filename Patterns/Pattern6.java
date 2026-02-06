12345
1234
123
12
1

class Solution {
    			
    public void pattern1(int N) {
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= N-i+1 ; j++) 
            
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

