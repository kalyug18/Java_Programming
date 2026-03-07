class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=arr[0];
        
        for (int num:arr)
        {
            if(num>max)
            max=num;
        }
      return max;
        
    }
}
