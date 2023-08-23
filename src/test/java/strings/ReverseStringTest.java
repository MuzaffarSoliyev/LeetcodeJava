package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {
  private ReverseString reverseString;

  @Before
  public void createSolverObject() {
    this.reverseString = new ReverseString();
  }

  @Test
  public void shouldBeReturn0() {
    Assert.assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, reverseString.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}));
  }

  @Test
  public void shouldBeReturn1() {
    Assert.assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, reverseString.reverseString(new char[]{'H', 'a', 'n', 'n', 'a', 'h'}));
  }
}
