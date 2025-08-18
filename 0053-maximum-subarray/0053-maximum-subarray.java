class Solution {
    public int maxSubArray(int[] nums) {
        //kadane's algo

        int maximum = Integer.MIN_VALUE;
        int sum =0;

        for(int i=0; i<nums.length; i++){
            //adding every element to the sum
            sum = sum + nums[i];

            //updating maximum sum condition
            if(sum > maximum){
                maximum = sum;
            }

            //if sum is < 0 i.e negative we dont carry any negative sum
            if(sum < 0){
                sum = 0;
            }
        }

        return maximum;
    }
}