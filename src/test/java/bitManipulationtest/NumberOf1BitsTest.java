package bitManipulationtest;

import bitManipulation.NumberOf1Bits;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOf1BitsTest {
    private NumberOf1Bits numberOf1Bits;

    @Before
    public void createSolverObject() {
        numberOf1Bits = new NumberOf1Bits();
    }

    @Test
    public void test1(){
        Assert.assertEquals(3, numberOf1Bits.hammingWeight(11));
    }

    @Test
    public void test2(){
        Assert.assertEquals(1, numberOf1Bits.hammingWeight(128));
    }

    @Test
    public void test3(){
        Assert.assertEquals(30, numberOf1Bits.hammingWeight(2147483645));
    }
}
