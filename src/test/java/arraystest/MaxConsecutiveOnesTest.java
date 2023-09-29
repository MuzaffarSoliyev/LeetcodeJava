package arraystest;

import arrays.MaxConsecutiveOnes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxConsecutiveOnesTest {
  private MaxConsecutiveOnes maxConsecutiveOnes;

  @Before
  public void createSolverObject() {
    maxConsecutiveOnes = new MaxConsecutiveOnes();
  }

  @Test
  public void test1() {
    Assert.assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
  }

  @Test
  public void test2() {
    Assert.assertEquals(2, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
  }

  @Test
  public void test3() {
    Assert.assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1}));
  }
}
