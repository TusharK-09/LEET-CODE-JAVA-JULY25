class Solution {
    public int findLucky(int[] arr) {
        int largestLucky = -1; // Start from -1 as per problem requirements
        
        for (int i = 0; i < arr.length; i++) {
            int frequency = 0;

            // Count how many times arr[i] appears in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }

            // Check if arr[i] is a lucky number
            if (arr[i] == frequency) {
                // Update largest lucky number
                if (arr[i] > largestLucky) {
                    largestLucky = arr[i];
                }
            }
        }

        return largestLucky;
    }
}
