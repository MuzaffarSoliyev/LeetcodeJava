package arraystest;

import arrays.RemoveDuplicatesFromSortedArray;
import arrays.RemoveElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveElementTest {
  private RemoveElement assertEquals;

  @Before
  public void createSolverObject() {
    assertEquals = new RemoveElement();
  }

  @Test
  public void test1() {
    Assert.assertEquals(2, assertEquals.removeElement(new int[]{3, 2, 2, 3}, 3));
  }

  @Test
  public void test2() {
    Assert.assertEquals(5, assertEquals.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
  }
}
