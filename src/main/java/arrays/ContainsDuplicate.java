package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set set = new HashSet();
    for (int num : nums) {
      set.add(num);
    }
    return set.size() != nums.length;
  }
}
