package arraystest;

import arrays.MissingNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MissingNumberTest {
  private MissingNumber missingNumber;

  @Before
  public void createSolverObject() {
    missingNumber = new MissingNumber();
  }

  @Test
  public void shouldBeReturnTwo() {
    Assert.assertEquals(2, missingNumber.missingNumber(new int[]{3, 0, 1}));
  }

  @Test
  public void shouldBeReturnTwo2() {
    Assert.assertEquals(2, missingNumber.missingNumber(new int[]{0, 1}));
  }

  @Test
  public void shouldBeReturnTwo3() {
    Assert.assertEquals(8, missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
  }
}
