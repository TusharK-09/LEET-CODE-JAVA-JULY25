class Solution {
    public void moveZeroes(int[] nums) {
        //in-place shifting
        int startPos = 0;
        for(int num : nums){
            if(num != 0) {
                nums[startPos++] = num;
            }
        }

        //add remaining zeroes
        while (startPos < nums.length){
            nums[startPos++] = 0;
        } 
    }
}