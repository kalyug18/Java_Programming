import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min)
            min = arr[i];
            else if(arr[i] > max)
            max = arr[i];
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        
        return ans;
    }
} 
