package arrays;


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

public class ConvertSortedArrayToBinarySearchTree {
  public TreeNode sortedArrayToBST(int[] nums) {
    return generate(nums, 0, nums.length - 1);
  }

  public TreeNode generate(int[] nums, int left, int right) {
    if (left > right) {
      return null;
    }
    int middle = (left + right) / 2;
    TreeNode root = new TreeNode(nums[middle]);
    root.left = generate(nums, left, middle - 1);
    root.right = generate(nums, middle + 1, right);
    return root;
  }
}
