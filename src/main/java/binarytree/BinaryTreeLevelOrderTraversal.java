package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        return traverse(root, new ArrayList<>(), 0);
    }

    public List<List<Integer>> traverse(TreeNode node, List<List<Integer>> levels, int level) {
        if (node == null){
            return levels;
        }
        if(level == levels.size()){
            levels.add(new ArrayList<>());
        }
        levels.get(level).add(node.val);
        levels = traverse(node.left, levels, level + 1);
        levels = traverse(node.right, levels, level + 1);
        return levels;
    }
}
