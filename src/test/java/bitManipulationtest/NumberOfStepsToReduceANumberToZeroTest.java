package bitManipulationtest;

import bitManipulation.NumberOfStepsToReduceANumberToZero;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOfStepsToReduceANumberToZeroTest {
  private NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero;

  @Before
  public void createSolverObject() {
    numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
  }

  @Test
  public void test1(){
    Assert.assertEquals(6, numberOfStepsToReduceANumberToZero.numberOfSteps(14));
  }
  @Test
  public void test2(){
    Assert.assertEquals(4, numberOfStepsToReduceANumberToZero.numberOfSteps(8));
  }
  @Test
  public void test3(){
    Assert.assertEquals(12, numberOfStepsToReduceANumberToZero.numberOfSteps(123));
  }
}
