package arrays;

public class PlusOne {
  public int[] plusOne(int[] digits) {
    int n = digits.length;
    if (digits[n - 1] < 9) {
      digits[n - 1]++;
    } else {
      int i = n - 1;
      while (i > -1 && digits[i] > 8) {
        digits[i] = 0;
        i--;
      }
      if (i == -1) {
        digits = new int[n + 1];
        digits[0] = 1;
      } else {
        digits[i]++;
      }

    }
    return digits;
  }
}
