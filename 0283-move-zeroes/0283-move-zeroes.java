class Solution {
    public void moveZeroes(int[] nums) {
       int [] res = new int[nums.length];
       int k = 0;
       int j = nums.length - 1;
       int i = 0;
       while(i < nums.length){
        if(nums[i] == 0){
            res[j] = nums[i];
            j--;
        }
        else {
            res[k] = nums[i];
            k++;
        }
        i++;
       } 

       for(int z=0; z<nums.length; z++){
        nums[z] = res[z];
       }
    }
}