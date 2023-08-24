package strings;

public class LengthOfLastWord {
  public int lengthOfLastWord(String s) {
    int i = s.length() - 1, j = i;
    while (i >= 0) {
      if (s.charAt(i) == ' ') {
        i--;
      } else {
        j = i;
        while (i >= 0 && s.charAt(i) != ' ') {
          i--;
        }
        break;
      }
    }
    return j - i;
  }
}
