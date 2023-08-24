package arraystest;

import arrays.RemoveDuplicatesFromSortedArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {
  private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

  @Before
  public void createSolverObject() {
    removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
  }

  @Test
  public void test1() {
    Assert.assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2}));
  }

  @Test
  public void test2() {
    Assert.assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
  }
}
