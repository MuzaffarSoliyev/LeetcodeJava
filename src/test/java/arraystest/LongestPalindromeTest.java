package arraystest;

import arrays.LongestPalindrome;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestPalindromeTest {
  private LongestPalindrome longestPalindrome;

  @Before
  public void createSolverObject() {
    longestPalindrome = new LongestPalindrome();
  }

  @Test
  public void test1() {
    Assert.assertEquals(7, longestPalindrome.longestPalindrome("abccccdd"));
  }

  @Test
  public void test2() {
    Assert.assertEquals(1, longestPalindrome.longestPalindrome("a"));
  }
}
