package slidingwindow;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubstringsOfSizeThreeWithDistinctCharactersTest {
  private SubstringsOfSizeThreeWithDistinctCharacters substringsOfSizeThreeWithDistinctCharacters;

  @Before
  public void createSolverObject() {
    substringsOfSizeThreeWithDistinctCharacters = new SubstringsOfSizeThreeWithDistinctCharacters();
  }

  @Test
  public void test1() {
    Assert.assertEquals(1, substringsOfSizeThreeWithDistinctCharacters.countGoodSubstrings("xyzzaz"));
  }

  @Test
  public void test2() {
    Assert.assertEquals(4, substringsOfSizeThreeWithDistinctCharacters.countGoodSubstrings("aababcabc"));
  }
}
