class Solution {
    public int findLucky(int[] arr) {
        int largestLucky = -1; 

        for (int i = 0; i < arr.length; i++) {
            int frequency = 0;

            //frequency count
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }

            // Check if arr[i] is a lucky number
            if (arr[i] == frequency) {
               
                if (arr[i] > largestLucky) {
                    largestLucky = arr[i];
                }
                
            }
        }

        return largestLucky;
    }
}
