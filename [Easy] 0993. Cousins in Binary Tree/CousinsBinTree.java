class CousinsBinTree {
  int findLV = -1;
  
  /**
   * Time O(n), where n is the number of nodes.
   * Space O(h), where h is the height of tree.
   */
  public boolean isCousins(TreeNode root, int x, int y) {
    return dfs(root, x, y, 0);
  }
  
  private boolean dfs(TreeNode root, int x, int y, int lv) {
    if (root == null) {
      return false;
    }
    if (root.val == x || root.val == y) {
      if (findLV == -1) {
        findLV = lv;
      } else {
        return findLV == lv;
      }
    }
    if (root.left != null && root.right != null) {
      int left = root.left.val;
      int right = root.right.val;
      if ((left == x || left == y) && (right == x || right == y)) {
        return false;
      }
    }
    return dfs(root.left, x, y, lv + 1) || dfs(root.right, x, y, lv + 1);
  }
}