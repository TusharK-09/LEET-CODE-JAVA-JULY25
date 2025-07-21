import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        //Brute approach]
        for(int i=0; i<nums.length; i++){
            int currentElement = nums[i];
            nums[i] =  nums[i] * currentElement;
        }
        Arrays.sort(nums);
        return nums;

    }
}