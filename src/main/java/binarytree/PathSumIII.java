package binarytree;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {
    private int count = 0;
    public int pathSum(TreeNode root, long targetSum) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        traverse(root, targetSum, 0, map);
        return count;
    }

    public void traverse(TreeNode node, long targetSum, long currentSum, Map<Long, Integer> map) {
        if (node == null) return;
        currentSum += node.val;
        if (map.containsKey(currentSum - targetSum)) {
            count += map.get(currentSum - targetSum);
        }
        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        traverse(node.left, targetSum, currentSum, map);
        traverse(node.right, targetSum, currentSum, map);
        map.put(currentSum, map.get(currentSum) - 1);
    }
}
