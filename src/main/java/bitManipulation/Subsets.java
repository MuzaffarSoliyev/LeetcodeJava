package bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
  public List<List<Integer>> subsets(int[] nums) {
    int n = nums.length;
    List<List<Integer>> integers = new ArrayList<>();
    for (int musk = 0; musk < (1 << n); musk++) {
      List<Integer> tmp = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        if ((musk & (1 << i)) == 0) {
          tmp.add(nums[i]);
        }
      }
      integers.add(tmp);
    }
    return integers;
  }
}
