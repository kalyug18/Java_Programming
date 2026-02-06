1
22
333
4444
55555

class Solution {
    			
    public void pattern1(int N) {
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= i; j++) 
            
            {
                System.out.print(i);
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
