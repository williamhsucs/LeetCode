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
 * 
 *  - Because a valid BST’s left child is always smaller than its parent node, 
 *    and the parent node is always smaller than its right child. 
 *    So, I will use in-order traversal to traverse the tree.
 * 
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


/**
 * Follow Up:
 * If the BST is modified often (i.e., we can do insert and delete operations) 
 * and you need to find the kth smallest frequently, 
 * how would you optimize?
 * 
 * Think aloud:
 *  - The BST is modified often, 
 *    so the answer will be different even if we asked for the same kth smallest node.
 * 
 *  - Each node should store the number of descendant nodes including itself. 
 *    And update the value if its descendants have any modifications.
 * 
 *  - We should check the number of left descendants first. 
 *    Because it is a binary search tree, 
 *    the left child is always smaller than the current node and right child. 
 *    The descendants from the left child represent kth smallest nodes in the tree. 
 * 
 *  - When k is smaller or equal to descendants from the left child, 
 *    we will traverse to the left child.
 * 
 *  - We know that the right child is greater than the current node and all of the left descendants.
 *    So, when k is greater than descendants from the left child + 1 (current node).
 *    We will traverse to the right child.
 * 
 *  - If we can’t go left even right. It means the answer is the current node.
 * 
 */
public class KSBSTFollowUp {
  class TreeNode {
    int val;
    int descendant; // Add variable to store the number of descendant nodes including itself.
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
      this.val = val;
      this.descendant = 1;
    }
    TreeNode(int val, int descendant, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
      this.descendant = descendant;
    }
  }

  class FollowUp {
    
  /**
    * Time O(n), Tree traversal
    * Space O(h)
    */
    private void rebuildTree(TreeNode root) {
      if (root == null) return;
      if (root.left != null) {
        rebuildTree(root.left);
        root.descendant += root.left.descendant;
      }
      if (root.right != null) {
        rebuildTree(root.right);
        root.descendant += root.right.descendant;
      }
    }
    
    public int kthSmallest(TreeNode root, int k) {
    // This rebuild function should update every time when BST is modified.
      rebuildTree(root);
    /**
     * So, we have more efficient time to get the answer.
     * Time O(log n)
     * Space O(h)
     */
      return dfs(root, k);
    }

    /**
     * Time O(log n)
     *   - Without traverse
     * Space O(h)
     *   - Each element costs constant space O(1).
     *     And the size of the stack is exactly the depth of DFS.
     *     So in the worst case, it costs O(h) to maintain the system stack,
     *     where h is the maximum depth of DFS.
     */
    public int dfs(TreeNode node, int k) {
      if (node.left != null) {
        if (k <= node.left.descendant) {
          return dfs(node.left, k);
        } else if (k > node.left.descendant + 1) { 
          return dfs(node.right, k - node.left.descendant - 1);
        }
        return node.val;
      } else {
        if (k == 1) return node.val;
        return dfs(node.right, k - 1);
      }
    }
  }
}