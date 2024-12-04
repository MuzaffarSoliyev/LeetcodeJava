package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        return traverse(root, new ArrayList<>(), 0);
    }

    public List<Integer> traverse(TreeNode node, List<Integer> list, int level) {
        if (node == null) {
            return list;
        }

        if (level == list.size()) {
            list.add(node.val);
        }

        list.set(level, node.val);

        list = traverse(node.left, list, level + 1);
        list = traverse(node.right, list, level + 1);
        return list;
    }

}
