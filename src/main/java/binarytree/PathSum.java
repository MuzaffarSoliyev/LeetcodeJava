package binarytree;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (isLeaf(root)) {
            return targetSum - root.val == 0;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

}
