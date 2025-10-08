class Solution {
    public int findClosestNumber(int[] nums) {
        int positiveNear = Integer.MAX_VALUE;
        int negativeNear = Integer.MIN_VALUE;

        for(int num : nums){
        
            if(num >= 0){
                if(num < positiveNear){
                    positiveNear = num;
                }
            }

            if(num <0){
                if(num > negativeNear){
                    negativeNear = num;
                }
            }
        }

        if(positiveNear == Integer.MAX_VALUE) return negativeNear;
        if(negativeNear == Integer.MIN_VALUE) return positiveNear;

        if(positiveNear == Math.abs(negativeNear)) return positiveNear;
        return(positiveNear < Math.abs(negativeNear)) ? positiveNear : negativeNear;
    }
}