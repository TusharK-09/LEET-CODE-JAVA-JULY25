class Solution {
  
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointer for the last element of the initial part of nums1
        int p1 = m - 1;
        // Pointer for the last element of nums2
        int p2 = n - 1;
        // Pointer for the last position in the merged array (end of nums1)
        int p = m + n - 1;

        // Loop backwards from the end of both arrays
        while (p2 >= 0) {
            // If p1 is still in bounds AND nums1[p1] is larger than nums2[p2]
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                // Otherwise, nums2[p2] is larger or p1 is out of bounds
                nums1[p] = nums2[p2];
                p2--;
            }
            // Move the insertion pointer backwards
            p--;
        }
        // No need to handle remaining elements from nums1 because they are already in place.
    }
}