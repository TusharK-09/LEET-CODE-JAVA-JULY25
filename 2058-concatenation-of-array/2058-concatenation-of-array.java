class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[2*nums.length];
        int pointer = 0;
         for(int i=0; i<2; i++){
            for(int j=0; j<nums.length; j++){
                ans[pointer] = nums[j];
                pointer++; 
            }
         }
        return ans;
    }
}