class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        //first ith element
        for(int i=0; i<nums.length; i++){

            //for jth element
            for(int j=i+1; j<nums.length; j++){
                
                //condition check
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }

            }
        }
        return ans;
    }
}