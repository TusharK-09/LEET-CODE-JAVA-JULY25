class Solution {
    public int[] twoSum(int[] nums, int target) {
        //o(n) using HashMap
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int needed = target - nums[i];

            //check if needed element already exist in map
            if( map.containsKey(needed) ){
                return new int[] {map.get(needed) , i};
            }

            //keep inserting if needed does not exist
            map.put(nums[i] , i);
        }
        return new int[] {-1,-1};
    }
}