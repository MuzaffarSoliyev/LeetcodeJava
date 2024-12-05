package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        return traverse(root, new ArrayList<>(), 0);
    }

    public List<List<Integer>> traverse(TreeNode node, List<List<Integer>> levels, int level){
        if(node == null) return levels;
        if(level == levels.size()){
            levels.add(0, new ArrayList<>());
        }
        levels.get(levels.size() - level - 1).add(node.val);
        levels = traverse(node.left, levels, level + 1);
        levels = traverse(node.right, levels, level + 1);
        return levels;
    }
}
