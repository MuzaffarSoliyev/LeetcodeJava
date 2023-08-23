package arraystest;

import arrays.ContainsDuplicate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ContainsDuplicatesTest {
  private ContainsDuplicate containsDuplicate;

  @Before
  public void createSolverObject() {
    containsDuplicate = new ContainsDuplicate();
  }

  @Test
  public void shouldBeTrue1() {
    boolean res = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1});
    Assert.assertEquals(res, true);
  }

  @Test
  public void shouldBeFalse2() {
    boolean res = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4});
    Assert.assertEquals(res, false);
  }

  @Test
  public void shouldBeTrue3() {
    boolean res = containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
    Assert.assertEquals(res, true);
  }
}
