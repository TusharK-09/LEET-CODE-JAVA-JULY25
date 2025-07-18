class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] mergedArray = merge(nums1 , nums2);
        double median = 0;
        if (mergedArray.length % 2 == 0){
            int i1 = mergedArray.length / 2;
            int i2 = i1 - 1;
            median = (mergedArray[i1] +  mergedArray[i2]) / 2.0;
        }
        else {
            int j1 = (mergedArray.length) / 2;
            median = mergedArray[j1];
        }
        return median;
    }


    public int[] merge(int [] arr1, int arr2[]){
        
        int [] ans = new int[arr1.length + arr2.length];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while(p1 < arr1.length || p2 < arr2.length){
        int value1 = p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;
        int value2 = p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE;

        if(value1 < value2) {
            ans[p3] = value1;
            p1++;
        } else {
            ans[p3] = value2;
            p2++;
        }

        p3++;

        }
        return ans;
    }
    
}