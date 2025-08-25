class Solution {
    public void rotate(int[] nums, int k) {
       k = k % nums.length;
       // reverse all
       reverse(nums ,  0 , nums.length - 1);

       //reverse first k
       reverse (nums , 0 , k - 1);

       //reverse last after k
       reverse (nums , k , nums.length - 1);
    }

       //helper for reverse
       public void reverse(int[] nums , int start , int end){
        int temp = 0;
        while(start < end){
            temp = nums[start];
            nums[start] =  nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    } 
}