class SumRootLeafBinNum {
  int sum = 0;
  
  /**
   * Time O(n), where n is the number of nodes.
   * Space O(h), where h is the height of tree.
   */
  public int sumRootToLeaf(TreeNode root) {
    dfs(root, 0);
    return sum;
  }
  
  private void dfs(TreeNode root, int subTotal) {
    subTotal = (subTotal << 1) + root.val;
    if (root.left != null) {
      dfs(root.left, subTotal);
    }
    if (root.right != null) {
      dfs(root.right, subTotal);
    }
    if (root.left == null && root.right == null) {
      sum += subTotal;
    }
  }
} 