package binarySearch;

public class BinarySearch {
  public int search(int[] nums, int target) {
    int left = -1, right = nums.length, middle;

    while (left < right - 1) {
      middle = (left + right) / 2;
      if (nums[middle] < target) {
        left = middle;
      } else if (nums[middle] > target) {
        right = middle;
      } else {
        return middle;
      }
    }
    return -1;
  }
}
