package binarytree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return traverse(root.left, root.right);
    }

    public boolean traverse(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == null && right == null;
        }
        if (left.val != right.val) {
            return false;
        }
        return traverse(left.left, right.right) && traverse(left.right, right.left);
    }
}
