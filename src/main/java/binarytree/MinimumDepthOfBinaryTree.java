package binarytree;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return depth(root, 0);
    }

    public int depth(TreeNode node, int depth) {
        if (node == null) return Integer.MAX_VALUE;
        if (isLeaf(node)) return depth + 1;
        return Math.min(depth(node.left, depth + 1), depth(node.right, depth + 1));
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
