class RangeSumBST {
  /**
   * Time O(n)
   * Space O(h)
   */
  public int rangeSumBST(TreeNode root, int low, int high) {
    if (root == null) return 0;
    int sum = 0;
    if (root.left != null) {
      sum += rangeSumBST(root.left, low, high);
    }
    if (root.val >= low && root.val <= high) {
      sum += root.val;
    }
    if (root.right != null) {
      sum += rangeSumBST(root.right, low, high);
    }
    return sum;
  }
}