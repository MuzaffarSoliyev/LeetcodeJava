package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestPalindromicSubstringTest {
  private LongestPalindromicSubstring longestPalindromicSubstring;

  @Before
  public void createSolverObject() {
    longestPalindromicSubstring = new LongestPalindromicSubstring();
  }

  @Test
  public void test1() {
    Assert.assertEquals("aba", longestPalindromicSubstring.longestPalindrome("babad"));
  }

  @Test
  public void test2() {
    Assert.assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"));
  }
}
