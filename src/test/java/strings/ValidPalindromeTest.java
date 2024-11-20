package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidPalindromeTest {
  private ValidPalindrome validPalindrome;

  @Before
  public void createSolverObject(){
    validPalindrome = new ValidPalindrome();
  }

  @Test
  public void test1(){
    Assert.assertEquals(true, validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
  }

  @Test
  public void test2(){
    Assert.assertEquals(false, validPalindrome.isPalindrome("race a car"));
  }

  @Test
  public void test3(){
    Assert.assertEquals(true, validPalindrome.isPalindrome(" "));
  }

  @Test
  public void test4(){
    Assert.assertEquals(false, validPalindrome.isPalindrome("0P"));
  }

  @Test
  public void test5(){
    Assert.assertEquals(true, validPalindrome.isPalindrome("ab_a"));
  }
}
