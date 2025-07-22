class Solution {
    public int maxArea(int[] height) {
        int left = 0; // Pointer at the start of the array
        int right = height.length - 1; // Pointer at the end of the array
        int maxArea = 0; // Variable to track the maximum area

        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the area between the two pointers
            int area = Math.min(height[left], height[right]) * (right - left);
            // Update maxArea if the current area is larger
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea; // Return the maximum area found
    }
}
