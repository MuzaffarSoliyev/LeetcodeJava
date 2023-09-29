package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> numsSet = new HashSet<>();
    List<Integer> resultList = new ArrayList<>();
    for (int i = 0; i < nums1.length; i++) {
      numsSet.add(nums1[i]);
    }

    for (int i = 0; i < nums2.length; i++) {
      if (numsSet.contains(nums2[i])) {
        resultList.add(nums2[i]);
        numsSet.remove(nums2[i]);
      }
    }
    int[] resultArray = new int[resultList.size()];
    for (int i = 0; i < resultArray.length; i++) {
      resultArray[i] = resultList.get(i);
    }
    return resultArray;
  }
}
