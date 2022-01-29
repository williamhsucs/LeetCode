/**
 * The conditions are:
 *  - This tree is a binary search tree.
 *  - At least one node.
 *  - The k value is smaller than the number of nodes.
 * 
 * List some examples:
 * 
 *          3               3         1
 *         / \     |       /     |
 *        1   4    |      2      |
 *         \       |     /       |
 *          2      |    1        |
 *                 |   /
 *                    0
 * 
 * Think aloud:
 *  - This is a typical problem of finding a specific node. 
 *    I prefer to use DFS to solve this problem.
 *  - Because a valid BST’s left child is always smaller than its parent node, 
 *    and the parent node is always smaller than its right child. 
 *    So, I will use in-order traversal to traverse the tree.
 *  - Use a variable to record the traversal history. 
 *    When the value of this variable is equal to k, 
 *    return the value of the current node.
 */

/**
 * Time O(n)
 * Space O(h)
 */
class KthSmallestElementBST {
  private int val = 0;
  private int count = 0;
  
  public int kthSmallest(TreeNode root, int k) {
    dfs(root, k);
    return val;
  }

  /**
   * Time O(n)
   * Space O(h)
   *   - Each element costs constant space O(1).
   *     And the size of the stack is exactly the depth of DFS.
   *     So in the worst case, it costs O(h) to maintain the system stack,
   *     where h is the maximum depth of DFS.
   */
  public void dfs(TreeNode node, int k) {
    if (node == null) return;
    dfs(node.left, k);
    if (++count == k) this.val = node.val;
    dfs(node.right, k);
  }
}