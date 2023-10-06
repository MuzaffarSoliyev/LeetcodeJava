package binarySearchtest;

import binarySearch.BinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
  private BinarySearch binarySearch;

  @Before
  public void createSolverObject() {
    binarySearch = new BinarySearch();
  }

  @Test
  public void test1() {
    Assert.assertEquals(4, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
  }

  @Test
  public void test2() {
    Assert.assertEquals(-1, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
  }
}
