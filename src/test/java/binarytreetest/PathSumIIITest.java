package binarytreetest;

import binarytree.PathSumIII;
import binarytree.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class PathSumIIITest {
    private PathSumIII pathSumIII;

    @Before
    public void createSolverObject() {
        pathSumIII = new PathSumIII();
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(1, new TreeNode(-2, null,null), new TreeNode(-3, null,null));
        System.out.println(pathSumIII.pathSum(root, -1));
    }
}
