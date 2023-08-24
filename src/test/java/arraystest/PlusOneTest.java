package arraystest;

import arrays.PlusOne;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlusOneTest {
  private PlusOne plusOne;

  @Before
  public void CreateSolverObject() {
    plusOne = new PlusOne();
  }

  @Test
  public void test1() {
    Assert.assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
  }

  @Test
  public void test2() {
    Assert.assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
  }

  @Test
  public void test3() {
    Assert.assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
  }

  @Test
  public void test4() {
    Assert.assertArrayEquals(new int[]{1, 0, 0, 0, 0}, plusOne.plusOne(new int[]{9, 9, 9, 9}));
  }

  @Test
  public void test5() {
    Assert.assertArrayEquals(new int[]{2, 0, 0, 0}, plusOne.plusOne(new int[]{1, 9, 9, 9}));
  }
}
