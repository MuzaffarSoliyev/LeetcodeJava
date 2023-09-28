package arraystest;

import arrays.PascalsTriangleII;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleIITest {
  private PascalsTriangleII pascalsTriangleII;

  @Before
  public void createSolverObject() {
    pascalsTriangleII = new PascalsTriangleII();
  }

  @Test
  public void test1() {
    List<Integer> result = new ArrayList<>();
    result.add(1);
    result.add(3);
    result.add(3);
    result.add(1);
    Assert.assertEquals(result, pascalsTriangleII.getRow(3));
  }

  @Test
  public void test2() {
    List<Integer> result = new ArrayList<>();
    result.add(1);
    Assert.assertEquals(result, pascalsTriangleII.getRow(0));
  }

  @Test
  public void test3() {
    List<Integer> result = new ArrayList<>();
    result.add(1);
    result.add(1);

    Assert.assertEquals(result, pascalsTriangleII.getRow(1));
  }
}
