package arrays;

public class BuildArrayFromPermutation {
  public int[] buildArray(int[] nums) {
    int[] tmp = new int[nums.length];
    for (int i = 0; i < nums.length; i++){
      tmp[i] = nums[nums[i]];
    }
    return tmp;
  }
}
