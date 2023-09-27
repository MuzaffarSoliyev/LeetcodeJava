package arraystest;

import arrays.PascalsTriangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PascalsTriangleTest {
  private PascalsTriangle pascalsTriangle;

  @Before
  public void createSolverObject() {
    pascalsTriangle = new PascalsTriangle();
  }

  @Test
  public void test1() {
    List<List<Integer>> t1 = pascalsTriangle.generate(5);
    System.out.println(t1);
  }

  @Test
  public void test2() {
    List<List<Integer>> t2 = pascalsTriangle.generate(1);
    System.out.println(t2);
  }
}
