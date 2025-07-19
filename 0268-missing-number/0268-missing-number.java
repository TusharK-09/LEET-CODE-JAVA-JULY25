class Solution {
    public int missingNumber(int[] nums) {
        //first step is to sort
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] <= nums[i]){
                    int temp =  nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    temp = 0;
                }
            }
        }

        //step 1 get the range
        int n = nums.length;
        int missing = 0;
        int start = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }

        return  n;
    }
}