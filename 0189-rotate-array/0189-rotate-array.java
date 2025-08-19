class Solution {
    public void rotate(int[] nums, int k) {
        int [] ans = new int[nums.length];

        int ansPtr = 0;
    
        k = k % nums.length;


        for(int i= nums.length - k; i < nums.length; i++){
                ans[ansPtr] = nums[i];
                ansPtr++;
        }

        for(int i=0; i <nums.length -  k; i++){
                ans[ansPtr] = nums[i];
                ansPtr++;
        }

        for(int i=0; i<nums.length; i++){
            nums[i] =  ans[i];
        }
    }
}