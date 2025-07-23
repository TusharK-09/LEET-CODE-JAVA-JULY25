class Solution {
    public int maxArea(int[] height) {
        int maxCapacity = 0;
        int start = 0;
        int end = height.length - 1;

        while(start < end){
            int minHeight = Math.min(height[start] , height[end]);
            int width = end - start;
            int currentCapacity = minHeight * width;
            
            if(currentCapacity >= maxCapacity){
                maxCapacity = currentCapacity;
            }

            if(height[start] <= height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxCapacity;
    }
}