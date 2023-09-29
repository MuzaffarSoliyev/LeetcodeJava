package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {
  private Map<Integer, Integer> map = new HashMap<>();
  private List<Integer> result = new ArrayList<>();

  public int[] intersect(int[] nums1, int[] nums2) {

    if (nums1.length > nums2.length) {
      getCountsOfNumber(nums2, nums1);
    } else {
      getCountsOfNumber(nums1, nums2);
    }
    int[] resultArray = new int[result.size()];
    for (int i = 0; i < resultArray.length; i++) {
      resultArray[i] = result.get(i);
    }
    return resultArray;
  }

  public void getCountsOfNumber(int[] nums, int[] numLonger) {
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int i = 0; i < numLonger.length; i++) {
      if (map.containsKey(numLonger[i])) {
        if (map.get(numLonger[i]) == 0) {
          map.remove(numLonger[i]);
        } else {
          result.add(numLonger[i]);
          map.put(numLonger[i], map.get(numLonger[i]) - 1);
        }
      }
    }
  }

}
