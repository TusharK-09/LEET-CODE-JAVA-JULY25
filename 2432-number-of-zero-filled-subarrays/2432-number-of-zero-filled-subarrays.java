class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long totalCount = 0;
        long consecutiveZeros = 0;

        for (int num : nums) {
            if (num == 0) {
                consecutiveZeros++;
                totalCount += consecutiveZeros;
            } else {
                consecutiveZeros = 0;
            }
        }
        return totalCount;
    }
}