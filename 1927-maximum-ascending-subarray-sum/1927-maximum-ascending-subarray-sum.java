class Solution {
    public int maxAscendingSum(int[] nums) {
        int current = nums[0];
        int max = current;
        int i = 1;
        while(i<nums.length){
            if(nums[i -1] < nums[i]){
                current =  current + nums[i];
            } else {
                current = nums[i];
            }

            if(current > max){
                max = current;
            }
            
            i++;
        }
        return max;
    }
}