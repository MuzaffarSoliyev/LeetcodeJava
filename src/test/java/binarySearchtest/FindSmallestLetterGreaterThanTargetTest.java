package binarySearchtest;

import binarySearch.FindSmallestLetterGreaterThanTarget;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindSmallestLetterGreaterThanTargetTest {

  private FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget;

  @Before
  public void createSolverObject() {
    findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();
  }

  @Test
  public void test1() {
    Assert.assertEquals('c', findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
  }

  @Test
  public void test2() {
    Assert.assertEquals('f', findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
  }

  @Test
  public void test3() {
    Assert.assertEquals('x', findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z'));
  }
}
