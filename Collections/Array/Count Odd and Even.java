class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        
        int[] count ={0,0};
        
        for(int i : arr){
            
            if(i%2==0){
                count[1]+=1;
                }
                
                else{
                count[0]+=1;
            }
        }
        return count;
    }
}
