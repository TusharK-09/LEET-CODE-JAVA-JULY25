class Solution {
    public int[] twoSum(int[] nums, int target) {
         int [] ans = new int[2];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int needed = target - nums[i];
            
            if(map.containsKey(needed)){
                return new int[] {map.get(needed), i};
            }
            
            map.put(nums[i] , i);
        }
        
        return new int[]{};
    }
}