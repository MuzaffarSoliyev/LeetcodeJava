package strings;

public class LongestPalindromicSubstring {
  private int begin;
  private int length;

  public String longestPalindrome(String s) {
    if (s.length() < 2) {
      return s;
    }
    for (int i = 0; i < s.length(); i++) {
      check(i, i, s);
      check(i, i + 1, s);
    }
    return s.substring(begin, begin + length);
  }

  private void check(int start, int end, String s) {
    while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
      start--;
      end++;
    }
    if (end - start - 1 > length) {
      begin = start + 1;
      length = end - start - 1;
    }
  }
}
