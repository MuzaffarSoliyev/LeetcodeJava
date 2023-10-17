package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
  public int longestPalindrome(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }
    for (Character key : map.keySet()) {
      if (map.get(key) % 2 != 0) {
        count++;
      }
    }
    return count > 0 ? s.length() - count + 1 : s.length();
  }
}
