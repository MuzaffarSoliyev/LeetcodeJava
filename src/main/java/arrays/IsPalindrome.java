package arrays;

public class IsPalindrome {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    return reverse(x) == x;
  }

  public int reverse(int num) {
    int reversedNumber = 0;
    while (num > 0) {
      reversedNumber = reversedNumber * 10 + num % 10;
      num /= 10;
    }
    return reversedNumber;
  }
}
