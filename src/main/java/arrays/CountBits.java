package arrays;

public class CountBits {
  public int[] countBits(int n) {
    int[] countsOfOnes = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      countsOfOnes[i] = getCountOfOnes(i);
    }
    return countsOfOnes;
  }

  public int getCountOfOnes(int num) {
    int countOfOnes = 0;
    while (num > 1) {
      if (num % 2 == 1) {
        countOfOnes++;
      }
      num /= 2;
    }
    return countOfOnes + num;
  }
}
