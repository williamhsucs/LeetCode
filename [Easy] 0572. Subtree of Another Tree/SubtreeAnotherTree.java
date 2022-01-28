/**
 * The conditions are:
 *   - The tree itself can be a subtree.
 *   - A subtree is a tree that consists of a node in the root tree and all of its descendants.
 *   - Node values can be duplicated.
 * 
 * List some examples:
 * 
 *          1                  1                  1      1
 *         / \          |     / \          |     /
 *        2   3    2    |    2   3    2    |    1
 *       / \      / \   |   / \      / \   |
 *      4   5    4   5  |  4   5    4   5  |
 *                      |     /            |
 *                           1
 * 
 * Think aloud:
 * 
 *   - This is a typical problem of finding a specific node.
 *     I prefer to use DFS to solve this problem.
 * 
 *   - If a tree itself is a subtree,
 *     the problem becomes to check whether two trees are the same or not.
 * 
 *          1           1
 *         / \    |    / \
 *        2   3   |   2   3
 * 
 *   - So, I will traverse the root tree to find the value which matches with the root value of the subRoot tree.
 *     And then start from this node to check whether two trees are the same or not.
 */

class SubtreeAnotherTree {
  /**
   * Time O(n)
   * Space O(h)
   */
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null) return false;
    if (dfs(root, subRoot)) return true;
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  /**
   * Time O(n)
   * Space O(h)
   *   - Each element costs constant space O(1).
   *     And the size of the stack is exactly the depth of DFS.
   *     So in the worst case, it costs O(h) to maintain the system stack,
   *     where h is the maximum depth of DFS.
   */
  public boolean dfs(TreeNode root, TreeNode subRoot) {
    if (root == null && subRoot == null) return true;
    if (root == null || subRoot == null) return false;
    if (root.val != subRoot.val) return false;
    return dfs(root.left, subRoot.left) && dfs(root.right, subRoot.right);
  }
}