package arraystest;

import arrays.ValidParentheses;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesesTest {
  private ValidParentheses validParentheses;

  @Before
  public void createSolverObject() {
    validParentheses = new ValidParentheses();
  }

  @Test
  public void test1() {
    Assert.assertEquals(true, validParentheses.isValid("()"));
  }

  @Test
  public void test2() {
    Assert.assertEquals(true, validParentheses.isValid("()[]{}"));
  }

  @Test
  public void test4() {
    Assert.assertEquals(false, validParentheses.isValid("(]"));
  }

  @Test
  public void test5() {
    Assert.assertEquals(false, validParentheses.isValid("([]"));
  }

  @Test
  public void test6() {
    Assert.assertEquals(false, validParentheses.isValid(")[]"));
  }

  @Test
  public void test7() {
    Assert.assertEquals(false, validParentheses.isValid("([)]"));
  }
}
