package arraystest;

import arrays.BinaryPrefixDivisibleBy5;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class BinaryPrefixDivisibleBy5Test {
    private BinaryPrefixDivisibleBy5 binaryPrefixDivisibleBy5;

    @Before
    public void createSolverObject() {
        binaryPrefixDivisibleBy5 = new BinaryPrefixDivisibleBy5();
    }

    @Test
    public void test1() {
        Assert.assertEquals(List.of(true, false, false), binaryPrefixDivisibleBy5.prefixesDivBy5(new int[]{0, 1, 1}));
    }

    @Test
    public void test2() {
        Assert.assertEquals(List.of(false, false, false), binaryPrefixDivisibleBy5.prefixesDivBy5(new int[]{1, 1, 1}));
    }

    @Test
    public void test3() {
        Assert.assertEquals(List.of(false, false, true, false, false, false, false, false, false, false, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, true, false, false, true, true, true, true, true, true, true, false, false, true, false, false, false, false, true, true), binaryPrefixDivisibleBy5.prefixesDivBy5(new int[]{1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0}));
    }


}
