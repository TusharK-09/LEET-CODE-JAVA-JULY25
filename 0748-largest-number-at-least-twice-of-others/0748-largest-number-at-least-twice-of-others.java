class Solution {
    public int dominantIndex(int[] nums) {
        boolean isLargest = true;
        //Finding largest
        int max = nums[0];
        int maxIndex = 0;
        int secondLargest = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= max){
                max = nums[i];
                maxIndex = i;

            }
        }

        //compare max to twice of evry elemnt expect itself
        for(int i=0; i<nums.length; i++){
           if(i == maxIndex){
            continue;
           }
           else {
            if (max < 2 * nums[i]) {
           return -1;
        }
           }
         
        }
       
     return maxIndex;
    }
}