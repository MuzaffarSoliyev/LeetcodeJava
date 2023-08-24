package strings;

public class ReverseWordsInAStringOptimized {
  public String reverseWords(String s) {
    int i = s.length() - 1, j = i;
    StringBuilder result = new StringBuilder();
    while (i >= 0) {
      if (s.charAt(i) == ' ') {
        i--;
      } else {
        j = i;
        while (i >= 0 && s.charAt(i) != ' ') {
          i--;
        }
        if (result.length() > 0) {
          result.append(' ');
        }
        for (int k = i + 1; k <= j; k++) {
          result.append(s.charAt(k));
        }
      }
    }
    return result.toString();
  }
}
