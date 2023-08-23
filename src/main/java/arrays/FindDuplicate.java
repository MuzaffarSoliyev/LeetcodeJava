package arrays;

public class FindDuplicate {
  public int findDuplicate(int[] nums) {
    int n = nums.length, result = 0;
    int[] allNums = new int[n - 1];

    for (int num : nums) {
      if (allNums[num - 1] == 0) {
        allNums[num - 1] = num;
      } else {
        result = num;
        break;
      }
    }
    if (result == 0)
      result = n;
    return result;
  }
}
