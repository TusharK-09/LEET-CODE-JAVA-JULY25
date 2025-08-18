class Solution {
    public void rotate(int[] nums, int k) {
        //new ans array
        int [] ans = new int[nums.length];
        //ans pointer => j
        int j = 0;
        k = k % nums.length;
        //adding rotating elements of k steps at start
        for(int i=nums.length -  k; i<nums.length; i++){
            ans[j] = nums[i];
            j++;
        }

        //add start elements of original array to last as per rotation
        for(int i=0; i< nums.length - k; i++){
            ans[j] = nums[i];
            j++;
        }

        //copying before returning
        for(int i=0; i<nums.length; i++){
            nums[i] = ans[i];
        }
    }
}