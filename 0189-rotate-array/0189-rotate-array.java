class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int [] ans = new int[nums.length];
        int ansPtr  = 0;

        //getting k stepped elements at start
        for(int i=nums.length - k; i<nums.length; i++){
            ans[ansPtr++] = nums[i];
        }

        //remaining to end as empty spaces firstly shifted elements
        for(int i=0; i<nums.length - k; i++){
            ans[ansPtr++] = nums[i];
        }

        //copy replace answer
        for(int i=0; i<nums.length; i++){
            nums[i] = ans[i];
        }
    }
}