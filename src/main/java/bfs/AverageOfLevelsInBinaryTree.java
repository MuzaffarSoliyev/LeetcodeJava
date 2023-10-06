package bfs;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

public class AverageOfLevelsInBinaryTree {
  public List<Double> averageOfLevels(TreeNode root) {
    List<TreeNode> queue = new ArrayList<>();
    List<Double> result = new ArrayList<>();
    double sum = 0;
    int length = 0;
    queue.add(root);
    while (queue.size() > 0) {
      sum = 0;
      length = queue.size();
      for (int i = 0; i < length; i++) {
        TreeNode tmp = queue.get(0);
        queue.remove(0);
        sum += tmp.val;
        if (tmp.left != null) {
          queue.add(tmp.left);
        }
        if (tmp.right != null) {
          queue.add(tmp.right);
        }
      }
      result.add(sum / length);
    }
    return result;
  }
}
