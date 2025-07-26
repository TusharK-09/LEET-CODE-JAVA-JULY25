class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer , Integer> numbers = new HashMap<>();

        for(int n : nums){
            
            if(numbers.containsKey(n)){
                return true;
            }

            numbers.put(n , 1);
        }
        return false;
    }
    
}