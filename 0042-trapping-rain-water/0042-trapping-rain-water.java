class Solution {
    public int trap(int[] height) {
      //keeing track of left and right greatest elements
      int leftMax = 0;
      int rightMax = 0;
      int water = 0;
      
      //Two Pointer approach
      int left = 0;
      int right = height.length - 1;

      while(left < right){
        //agr right bda ha toh water kitna hold hoga woh left pr depend krta h
        if(height[left] < height[right]){
             
            //check if left max is greatest if no update
            if(height[left] > leftMax){
                leftMax = height[left];
            }
            
            //if leftMax already greater just add it to water
            else{
            water = water + leftMax - height[left];
            }

            left++;
        }

        
        else{

            //try updating greatest rightMax
            if(height[right] > rightMax){
                rightMax = height[right];
            }

            //if already greater add it to the water
            else{
                water = water + rightMax - height[right];
            }
            right--;
        }
      }

      return water;

      //  ============ Gives TLE for Large inputs =====================
    //   //one loop to iterate over array
    //   for(int i=0; i<height.length; i++){

    //     //Get left max
    //     leftMax = height[i];
    //     for(int j=0; j<i; j++){
    //         if(height[j] >  leftMax){
    //             leftMax = height[j];
    //         }
    //     }

    //     //Get right max
    //     rightMax = height[i];
    //     for(int k=i; k<height.length; k++){
    //         if(height[k] > rightMax){
    //             rightMax = height[k];
    //         }
    //     }

        //Water stored
       // water += Math.max( 0 , Math.min (leftMax , rightMax) - height[i] );
     // return water;
// ================================   ==========================================
    }
}