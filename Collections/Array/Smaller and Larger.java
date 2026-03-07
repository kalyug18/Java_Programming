
class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        
        int[] count ={0,0};
        
        for (int i=0;i< arr.length ;i++)
        {
            if (arr[i] <= target )
            
            count[0]+=1;
            
            else if (arr[i] >= target )
            
            count[1]+=1;
        }
        
        return count;
    }
}
