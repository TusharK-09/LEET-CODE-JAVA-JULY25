class Solution {
    public boolean increasingTriplet(int[] nums) {
       int firstNum = Integer.MAX_VALUE;
        int secondNum = Integer.MAX_VALUE;
        int thirdNum =  Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            int value = nums[i];

            if(firstNum >= value){
                firstNum = value;
            } else if (secondNum >= value){
                secondNum = value;
            }
            else {
                thirdNum =  value;
                return true;
            }
        }
        return false;
    }
}