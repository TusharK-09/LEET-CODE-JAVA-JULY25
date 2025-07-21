class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //very first thinking approach in my mind - giving TLE As o(n^2) is bad for large inputs
        // int [] ans  = new int[2];
        // int current = 0;
        // for(int i=0; i<numbers.length; i++){
        //     current = numbers[i];
        //     for(int j=i+1; j<numbers.length; j++){
        //         if(current + numbers[j] == target){
        //             ans[0] = i+1;
        //             ans[1] = j+1;            
        //             break;
        //         }
        //     }
        // }
        

        // Optimal Approach Clue => Sorted => TWO POINTER
        int start = 0;
        int end = numbers.length - 1;
        int [] ans = new int[2];

        while(start < end){
            int sum = numbers[start] + numbers[end];

            //agar wahi sum miljaye
            if(sum == target){
                ans[0] = start + 1;
                ans[1] = end + 1;
                break; 
            }
            //array sorted h mtlb => agar sum target se chota hai toh start++ krna pdega
            // agr sum bda hg toh end ko kam krna pdega (end--)
            if(sum < target){
                start++;
            }
            if(sum > target) {
                end--;
            }
        }
        return ans;
    }
}