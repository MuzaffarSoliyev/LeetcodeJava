package slidingwindow;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
  private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

  @Before
  public void createSolverObject() {
    longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
  }

  @Test
  public void test1() {
    Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
  }
  @Test
  public void test2() {
    Assert.assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
  }
  @Test
  public void test3() {
    Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
  }

  @Test
  public void test4() {
    Assert.assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab"));
  }

  @Test
  public void test5() {
    Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));
  }
}
