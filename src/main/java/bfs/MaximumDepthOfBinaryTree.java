package bfs;

import java.util.LinkedList;
import java.util.List;

public class MaximumDepthOfBinaryTree {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    List<TreeNode> queue = new LinkedList<>();
    int depth = 0, length;
    queue.add(root);
    while (queue.size() > 0) {
      length = queue.size();
      for (int i = 0; i < length; i++) {
        TreeNode tmp = queue.get(0);
        queue.remove(0);
        if (tmp.left != null)
          queue.add(tmp.left);
        if (tmp.right != null)
          queue.add(tmp.right);
      }
      depth++;
    }
    return depth;
  }
}
