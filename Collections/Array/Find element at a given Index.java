// User function Template for Java
class Solution {
    public static int findElementAtIndex(int key, int[] arr) {
        // code here
        
        int c=0;
        for(int i=0; i<arr.length; i++){
            
            if(arr[key]==arr[i]){
                c= arr[i];
            }
        }
        return c;
    }
}

