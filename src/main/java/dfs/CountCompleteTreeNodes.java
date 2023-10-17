package dfs;

import java.util.ArrayList;
import java.util.List;

public class CountCompleteTreeNodes {
  public int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int length, count = 0;
    TreeNode tmp;
    List<TreeNode> queue = new ArrayList<>();
    queue.add(root);

    while (queue.size() > 0) {
      length = queue.size();
      for (int i = 0; i < length; i++) {
        tmp = queue.get(0);
        queue.remove(0);
        if (tmp.right != null)
          queue.add(tmp.right);
        if (tmp.left != null)
          queue.add(tmp.left);
        count++;
      }
    }
    return count;
  }
}
