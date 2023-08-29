package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    Set<Character> characters = new HashSet<>();
    int start = 0, maxLength = 0;
    char curChar, startChar;
    for (int end = 0; end < s.length(); end++) {
      curChar = s.charAt(end);
      while (characters.contains(curChar)) {
        startChar = s.charAt(start);
        characters.remove(startChar);
        start++;
      }
      characters.add(curChar);
      maxLength = Math.max(end - start + 1, maxLength);
    }

    return maxLength;
  }
}
