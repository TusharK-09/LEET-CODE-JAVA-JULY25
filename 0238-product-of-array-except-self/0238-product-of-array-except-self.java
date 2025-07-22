class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] right = new int[n];
        int product = 1;

        //Storing right array product
        for(int i= n -1; i>=0; i--){
            product = product * nums[i];
            right[i] = product;
        }
        
        int [] result = new int[n];
        int leftPro = 1;
        for(int i=0; i<n -1; i++){
            int val = leftPro * right[i+1];
            
            result[i] = val;

            leftPro = leftPro * nums[i];
        }
        result[n-1] = leftPro;
        return result;
    }
}