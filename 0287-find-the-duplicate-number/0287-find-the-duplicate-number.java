class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int duplicate = -1;
        for(int i=0; i<nums.length; i++){
            
            if(i<nums.length - 1){
                if(nums[i] == nums[i+1]){
                    duplicate = nums[i];
                    break;
                }
            }
        }
        return duplicate;
    }
}