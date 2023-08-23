package arrays;

public class CountBitsWithBItsOperations {
  public int[] countBits(int n) {
    int[] counts = new int[n + 1];

    for (int i = 1; i < n + 1; i++) {
      counts[i] = counts[i >> 1] + i % 2;
    }
    return counts;
  }

}
