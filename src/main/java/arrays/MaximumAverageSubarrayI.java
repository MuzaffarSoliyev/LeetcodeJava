package arrays;

public class MaximumAverageSubarrayI {
  public double findMaxAverage(int[] nums, int k) {
    int start = 0, n = nums.length;
    double maxAvg = -1.0 * Double.MAX_VALUE, sum = 0, avg = 0;
    for (int end = 0; end < n; end++) {
      sum += nums[end];
      if (end - start + 1 == k) {
        avg = 1.0 * sum / k;
        if (avg > maxAvg) {
          maxAvg = avg;
        }
        sum -= nums[start];
        start++;
      }
    }
    return maxAvg;
  }
}
