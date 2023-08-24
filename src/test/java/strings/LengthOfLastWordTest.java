package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LengthOfLastWordTest {
  private LengthOfLastWord lengthOfLastWord;

  @Before
  public void createSolverObject() {
    lengthOfLastWord = new LengthOfLastWord();
  }

  @Test
  public void test1() {
    Assert.assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
  }

  @Test
  public void test2() {
    Assert.assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
  }

  @Test
  public void test3() {
    Assert.assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
  }
}
