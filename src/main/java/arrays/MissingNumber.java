package arrays;

public class MissingNumber {
  public int missingNumber(int[] nums) {
    int xorAll = 0;
    for (int i = 0; i <= nums.length; i++) {
      xorAll ^= i;
    }
    int xorInputNumbers = 0;
    for (int num : nums) {
      xorInputNumbers ^= num;
    }
    return xorAll ^ xorInputNumbers;
  }
}
