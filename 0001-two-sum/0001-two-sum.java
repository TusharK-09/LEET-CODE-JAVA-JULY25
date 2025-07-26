class Solution {
    public int[] twoSum(int[] nums, int target) {
         int [] ans = new int[2];
        HashMap<Integer , Integer> map = new HashMap<>();
        //Map
        for(int i=0; i<nums.length; i++){
            int needed = target - nums[i];
            
            if(map.containsKey(needed)){
                ans[0] = map.get(needed);
                ans [1] = i;
                break;
            }
            
            map.put(nums[i] , i);
        }
        
        return ans;
    }
}