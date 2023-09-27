package arrays;

public class SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    int left = -1, right = nums.length, middle;
    while (left < right - 1) {
      middle = (left + right) / 2;
      if (nums[middle] < target) {
        left = middle;
      } else {
        right = middle;
      }
    }
    return right;
  }
}
