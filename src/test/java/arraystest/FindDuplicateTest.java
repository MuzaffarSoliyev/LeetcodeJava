package arraystest;

import arrays.FindDuplicate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindDuplicateTest {
  private FindDuplicate findDuplicate;

  @Before
  public void createSolverObject() {
    findDuplicate = new FindDuplicate();
  }

  @Test
  public void shouldBeReturnTwo() {
    Assert.assertEquals(2, findDuplicate.findDuplicate(new int[]{1, 3, 4, 2, 2}));
  }

  @Test
  public void shouldBeReturnThree() {
    Assert.assertEquals(3, findDuplicate.findDuplicate(new int[]{3, 1, 3, 4, 2}));
  }
}
