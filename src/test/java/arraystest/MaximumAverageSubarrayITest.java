package arraystest;

import arrays.MaximumAverageSubarrayI;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumAverageSubarrayITest {
  private MaximumAverageSubarrayI maximumAverageSubarrayI;

  @Before
  public void createSolverObject() {
    maximumAverageSubarrayI = new MaximumAverageSubarrayI();
  }

  @Test
  public void test1() {
    Assert.assertEquals(12.75000, maximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 0.000001  );
  }

  @Test
  public void test2() {
    Assert.assertEquals(5.00000,  maximumAverageSubarrayI.findMaxAverage(new int[]{5}, 1), 0.000001  );
  }

  @Test
  public void test3() {
    Assert.assertEquals(-1.00000, maximumAverageSubarrayI.findMaxAverage(new int[]{-1}, 1), 0.001 );
  }
}
