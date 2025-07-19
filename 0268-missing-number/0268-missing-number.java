class Solution {
    public int missingNumber(int[] nums) {
        //step 1 get sum of range
        int range = nums.length;
        int rangeSum = 0;
            int j=0;
      for(int i=0; i<=nums.length; i++){
            rangeSum = rangeSum + i;
        }

        //step2 Get Sum of Array elements
        int arraySum = 0;
        for(int i=0; i<nums.length; i++){
            arraySum = arraySum + nums[i];
        }

        //step3 Compare array elements sum with  range sum difference is the missing number
        return  (rangeSum - arraySum);
    }
}