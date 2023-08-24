package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseWordsInAStringTest {
  private ReverseWordsInAString reverseWordsInAString;
  private ReverseWordsInAStringOptimized reverseWordsInAStringOptimized;

  @Before
  public void createSolverObject() {
    reverseWordsInAString = new ReverseWordsInAString();
    reverseWordsInAStringOptimized = new ReverseWordsInAStringOptimized();
  }

  @Test
  public void Test1() {
    Assert.assertEquals("blue is sky the", reverseWordsInAString.reverseWords("the sky is blue"));
    Assert.assertEquals("blue is sky the", reverseWordsInAStringOptimized.reverseWords("the sky is blue"));
  }

  @Test
  public void Test2() {
    Assert.assertEquals("world hello", reverseWordsInAString.reverseWords("  hello world  "));
    Assert.assertEquals("world hello", reverseWordsInAStringOptimized.reverseWords("  hello world  "));
  }

  @Test
  public void Test3() {
    Assert.assertEquals("example good a", reverseWordsInAString.reverseWords("a good   example"));
    Assert.assertEquals("example good a", reverseWordsInAStringOptimized.reverseWords("a good   example"));
  }
}
