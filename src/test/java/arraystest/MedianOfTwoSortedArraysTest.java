package arraystest;

import arrays.MedianOfTwoSortedArrays;
import org.junit.Before;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    private MedianOfTwoSortedArrays medianOfTwoSortedArrays;

    @Before
    public void createSolverObject() {
        medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
    }

    @Test
    public void test1() {
        System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    @Test
    public void test2() {
        System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }
}
