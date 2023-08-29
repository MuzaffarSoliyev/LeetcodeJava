package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SubstringsOfSizeThreeWithDistinctCharacters {
  public int countGoodSubstrings(String s) {
    Map<Character, Integer> letters = new HashMap<>();
    int start = 0, end, result = 0;
    char key;
    for (end = 0; end < s.length(); end++) {
      key = s.charAt(end);
      letters.put(key, letters.getOrDefault(key, 0) + 1);
      if (end - start == 3) {
        key = s.charAt(start);
        letters.put(key, letters.get(key) - 1);
        if (letters.get(key) == 0) {
          letters.remove(key);
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
