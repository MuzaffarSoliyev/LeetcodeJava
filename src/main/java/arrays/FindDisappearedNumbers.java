package arrays;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    Set<Integer> numsSet = new HashSet();
    for (int num : nums) {
      numsSet.add(num);
    }

    Set<Integer> allNumsSet = new HashSet();
    for (int i = 1; i <= nums.length; i++) {
      allNumsSet.add(i);
    }
    List<Integer> integers = new LinkedList<>();
    allNumsSet.removeAll(numsSet);
    integers.addAll(allNumsSet);

    return integers;
  }
}
