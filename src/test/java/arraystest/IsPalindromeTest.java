package arraystest;

import arrays.IsPalindrome;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsPalindromeTest {
  private IsPalindrome isPalindrome;


  @Before
  public void createSolverObject() {
    isPalindrome = new IsPalindrome();
  }

  @Test
  public void shouldBeReturnTrue() {
    Assert.assertEquals(true, isPalindrome.isPalindrome(121));
  }

  @Test
  public void shouldBeReturnFalse() {
    Assert.assertEquals(false, isPalindrome.isPalindrome(-121));
  }

  @Test
  public void shouldBeReturnFalse2() {
    Assert.assertEquals(false, isPalindrome.isPalindrome(10));
  }
}
