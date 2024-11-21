package binarySearchtest;

import binarySearch.SingleElementInSortedArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleElementInSortedArrayTest {
    private SingleElementInSortedArray singleElementInSortedArray;

    @Before
    public void createSolverObject() {
        singleElementInSortedArray = new SingleElementInSortedArray();
    }

    @Test
    public void test1() {
        Assert.assertEquals(singleElementInSortedArray.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}), 2);
    }
    @Test
    public void test2() {
        Assert.assertEquals(singleElementInSortedArray.singleNonDuplicate(new int[]{3,3,7,7,10,11,11}), 10);
    }
}
