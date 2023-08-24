package arrays;

import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = 0, tmp;
        for (int i = 0; i < n; i++) {
            if (nums1[i1] < nums2[i]) {
                while (nums1[i1] <= nums2[i] && i1 < m + i) {
                    i1++;
                }
            }
            for (int k = m + i - 1; k >= i1; k--) {
                tmp = nums1[k];
                nums1[k] = nums1[k + 1];
                nums1[k + 1] = tmp;
            }
            nums1[i1] = nums2[i];
        }
    }
}
