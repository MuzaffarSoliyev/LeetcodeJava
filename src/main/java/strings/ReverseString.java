package strings;

public class ReverseString {

  public char[] reverseString(char[] s) {
    char tmp;
    int n = s.length;
    for (int i = 0; i < n / 2; i++) {
      tmp = s[i];
      s[i] = s[n - i - 1];
      s[n - i - 1] = tmp;
    }
    return s;
  }
}
