class IncreasingOrderSearchTree {
  /**
   * Time O(n)
   * Space O(1)
   */
  public TreeNode increasingBST(TreeNode root) {
    TreeNode node = new TreeNode();
    rebuild(node, root);
    return node.right;
  }

  private TreeNode rebuild(TreeNode node, TreeNode root) {
    if (root == null) return node;
    if (root.left != null) {
      node = rebuild(node, root.left);
    }
    node.right = new TreeNode(root.val);
    node = node.right;
    if (root.right != null) {
      node = rebuild(node, root.right);
    }
    return node;
  }
}