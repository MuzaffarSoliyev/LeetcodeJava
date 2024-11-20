package arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int[] merged = new int[nums1.length + nums2.length];
        for (int k = 0; k < merged.length; k++) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    merged[k] = nums1[i++];
                } else {
                    merged[k] = nums2[j++];
                }
            } else {
                if (i == nums1.length) {
                    merged[k] = nums2[j++];
                } else {
                    merged[k] = nums1[i++];
                }
            }
        }
        return merged.length % 2 == 1 ? merged[merged.length / 2] : (double) (merged[merged.length / 2 - 1] + merged[merged.length / 2]) / 2;
    }
}
