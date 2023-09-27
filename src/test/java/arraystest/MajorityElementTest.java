package arraystest;

import arrays.MajorityElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MajorityElementTest {
  private MajorityElement majorityElement;

  @Before
  public void createSolverObject() {
    majorityElement = new MajorityElement();
  }

  @Test
  public void test1() {
    Assert.assertEquals(3, majorityElement.majorityElement(new int[]{3,2,3}));
  }
  @Test
  public void test2() {
    Assert.assertEquals(2, majorityElement.majorityElement(new int[]{2,2,1,1,1,2,2}));
  }

}
