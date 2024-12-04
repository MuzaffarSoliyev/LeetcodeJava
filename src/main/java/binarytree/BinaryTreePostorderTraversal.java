package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        return traverse(root, new ArrayList<>());
    }

    public List<Integer> traverse(TreeNode node, List<Integer> list) {
        if (node == null) return list;

        list = traverse(node.left, list);
        list = traverse(node.right, list);
        list.add(node.val);
        return list;
    }
}
