class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=arr[0];
        
        for (int num:arr) //for (int i=0;i<n;i++)
        {
            if(num>max)  //if (arr[i] >max)
            max=num;    //max=arr[i];
        }
      return max;
        
    }
}
