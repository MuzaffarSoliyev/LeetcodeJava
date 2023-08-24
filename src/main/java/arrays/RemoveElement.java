package arrays;

public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    int n = nums.length, tmp, i = 0;
    while (i < n) {
      if (nums[i] == val) {
        for (int j = i; j < n - 1; j++) {
          tmp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = tmp;
        }
        n--;
      } else {
        i++;
      }
    }
    return n;
  }
}
