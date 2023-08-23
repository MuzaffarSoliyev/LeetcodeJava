package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {
  private LongestCommonPrefix longestCommonPrefix;

  @Before
  public void createSolverObject() {
    this.longestCommonPrefix = new LongestCommonPrefix();
  }

  @Test
  public void shouldBeReturnFl() {
    Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
  }
  @Test
  public void shouldBeReturnEmptyString() {
    Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
  }
}
