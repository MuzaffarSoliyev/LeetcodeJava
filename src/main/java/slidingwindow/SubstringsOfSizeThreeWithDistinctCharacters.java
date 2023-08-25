package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SubstringsOfSizeThreeWithDistinctCharacters {
  public int countGoodSubstrings(String s) {
    Map<Character, Integer> letters = new HashMap<>();
    int start = 0, end = 0, result = 0;
    char leftChar;
    for (end = 0; end < s.length(); end++) {

      letters.put(s.charAt(end), 1);
      if (end - start == 3) {
        leftChar = s.charAt(start);
        letters.put(leftChar, letters.get(leftChar) - 1);
        if (letters.get(leftChar) == 0) {
          letters.remove(leftChar);
        }
        start++;
      }
      if (letters.size() == 3) {
        result++;
      }
    }
    return result;
  }
}
