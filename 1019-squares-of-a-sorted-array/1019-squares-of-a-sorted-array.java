import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        //Brute approach
        // for(int i=0; i<nums.length; i++){
        //     nums[i] =  nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        //optimized approach
        int start = 0;
        int end = nums.length - 1;
        int [] ans = new int[nums.length];
        int ansPointer = nums.length - 1;

        while(start <= end){
            int startSquare  = nums[start] * nums[start];
            int endSquare = nums[end] * nums[end];

            if(startSquare > endSquare){
                ans[ansPointer] = startSquare;
                start++;
            }
            else {
                ans[ansPointer] = endSquare;
                end--;
            }
            
            ansPointer--;
        }
        return ans;
    }
}