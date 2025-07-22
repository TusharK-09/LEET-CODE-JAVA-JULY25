class Solution {

    public int dominantIndex(int[] nums) {
        //Finding largest
        int max = nums[0];
        int maxIndex = 0;
        int secondLargest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];

                maxIndex = i;
            }
        }

        //Compare max to twice of every element of nums expect itself index
        for (int i = 0; i < nums.length; i++) {
            if (i == maxIndex) {
                continue;
            } else {
                if (max < 2 * nums[i]) {
                    return -1;
                }
            }
        }

        return maxIndex;
    }
}
