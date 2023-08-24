package arrays;

public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    int n = nums.length, i = 1, currentNumber = nums[0], tmp;
    while (i < n) {
      if (nums[i] == currentNumber) {
        for (int j = i; j < n - 1; j++) {
          tmp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = tmp;
        }
        n--;
      } else {
        currentNumber = nums[i];
        i++;
      }
    }
    return n;
  }
}
