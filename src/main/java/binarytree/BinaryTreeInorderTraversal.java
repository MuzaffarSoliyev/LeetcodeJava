package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        return traverse(root, new ArrayList<>());
    }

    public List<Integer> traverse(TreeNode node, List<Integer> list) {
        if (node == null){
            return list;
        }
        list = traverse(node.left, list);
        list.add(node.val);
        list = traverse(node.right, list);
        return list;

    }


}
