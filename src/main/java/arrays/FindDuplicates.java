package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
  public List<Integer> findDuplicates(int[] nums) {
    int n = nums.length, index;
    List<Integer> duplicates = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      index = Math.abs(nums[i]) - 1;
      if (nums[index] > 0) {
        nums[index] = -1 * nums[index];
      } else {
        duplicates.add(index + 1);
      }
    }
    return duplicates;
  }
}
