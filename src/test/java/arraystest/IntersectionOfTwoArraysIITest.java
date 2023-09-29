package arraystest;

import arrays.IntersectionOfTwoArraysII;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoArraysIITest {
  private IntersectionOfTwoArraysII intersectionOfTwoArraysII;

  @Before
  public void createSolverObject() {
    intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();
  }

  @Test
  public void test1() {
    Assert.assertArrayEquals(new int[]{2, 2}, intersectionOfTwoArraysII.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
  }

  @Test
  public void test2() {
    Assert.assertArrayEquals(new int[]{9, 4}, intersectionOfTwoArraysII.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
  }
}
