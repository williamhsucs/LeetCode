/**
 * Problem
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BTreeLvOrder {
  /**
   * Time O(n)
   * Space O(n)
   */
  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) return new LinkedList<>();
    // Space O(n)
    List<List<Integer>> list = new LinkedList<>();
    // Space O(n)
    List<Integer> lvList = null;
    // Space O(n)
    Queue<TreeNode> queue = new LinkedList<>();

    queue.offer(root);
    // Time O(n)
    while(!queue.isEmpty()) {
      lvList = new LinkedList<>();
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        // Time O(1)
        if (queue.peek().left != null) queue.offer(queue.peek().left);
        // Time O(1)
        if (queue.peek().right != null) queue.offer(queue.peek().right);
        // Time O(1)
        lvList.add(queue.poll().val);
      }
      // Time O(1)
      list.add(lvList);
    }

    return list;
  }
}