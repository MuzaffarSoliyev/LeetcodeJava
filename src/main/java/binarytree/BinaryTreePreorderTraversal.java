package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        return traversal(root, new ArrayList<>());
    }

    public List<Integer> traversal(TreeNode root, List<Integer> preorderList) {
        if (root == null) {
            return preorderList;
        }

        preorderList.add(root.val);

        preorderList = traversal(root.left, preorderList);
        preorderList = traversal(root.right, preorderList);

        return preorderList;
    }
}
