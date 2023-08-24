package arraystest;

import arrays.MergeSortedArray;
import org.junit.Before;
import org.junit.Test;

public class MergeSortedArrayTest {
    private MergeSortedArray mergeSortedArray;

    @Before
    public void createSolverObject(){
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    public void test1(){
        mergeSortedArray.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }

    @Test
    public void test2(){
        mergeSortedArray.merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}
