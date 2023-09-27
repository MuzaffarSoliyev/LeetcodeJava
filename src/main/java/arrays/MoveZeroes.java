package arrays;

import java.util.Arrays;
import java.util.List;

public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int tmpIdx = nums.length - 1, tmp;
    while (tmpIdx > -1) {
      if (nums[tmpIdx] == 0) {
        for (int i = tmpIdx; i < nums.length - 1; i++) {
          tmp = nums[i];
          nums[i] = nums[i + 1];
          nums[i + 1] = tmp;
        }
      }
      tmpIdx--;
    }
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }
}
