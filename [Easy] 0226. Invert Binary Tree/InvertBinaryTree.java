class InvertBinaryTreeDFS {
  /**
   * DFS
   * Time O(n)
   * Space O(h)
   */
  public TreeNode invertTree(TreeNode root) {
    if (root == null) return root;
    TreeNode node = new TreeNode(root.val);
    node.right = invertTree(root.left);
    node.left = invertTree(root.right);
    return node;
  }
}

class InvertBinaryTreeBFS {
  /**
   * BFS
   * Time O(n)
   * Space O(n)
   */
  public TreeNode invertTree(TreeNode root) {
    if (root == null) return root;
    // Space O(n)
    Queue<TreeNode> queue = new LinkedList<>();
    TreeNode ret = new TreeNode(root.val);
    queue.offer(root);
    queue.offer(ret);
    // Time O(n)
    while(!queue.isEmpty()) {
      TreeNode rootNode = queue.poll();
      TreeNode retNode = queue.poll();
      if (rootNode.left != null) {
        retNode.right = new TreeNode(rootNode.left.val);
        queue.offer(rootNode.left);
        queue.offer(retNode.right);
      }
      if (rootNode.right != null) {
        retNode.left = new TreeNode(rootNode.right.val);
        queue.offer(rootNode.right);
        queue.offer(retNode.left);
      }
    }
    return ret;
  }
}