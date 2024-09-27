package hashtable;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!sMap.containsKey(s.charAt(i)) && !tMap.containsKey(t.charAt(i))) {
                sMap.put(s.charAt(i), t.charAt(i));
                tMap.put(t.charAt(i), s.charAt(i));
            } else {
                if (!sMap.getOrDefault(s.charAt(i), ' ').equals(t.charAt(i)) || !tMap.getOrDefault(t.charAt(i),' ').equals(s.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
