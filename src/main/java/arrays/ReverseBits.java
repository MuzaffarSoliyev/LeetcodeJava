package arrays;

public class ReverseBits {
  public int reverseBits(int n) {
    int digitsCount = 32, result = 0;
    int[] digits = new int[digitsCount];
    String digitsString = Integer.toBinaryString(n);
    for (int i = digitsString.length() - 1; i >= 0; i--) {
      digits[digitsCount - (digitsString.length() - i)] = Character.getNumericValue((digitsString.charAt(i)));
    }

    for (int i = digitsCount - 1; i >= 0; i--) {
      result = (result << 1) + digits[i];
    }

    return result;
  }
}
