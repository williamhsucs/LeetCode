/**
 * Problem
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 * 
 * ************************************************************* 
 * 
 * Input: root = [1,null,2,3]
 * 
 * Output: [1,2,3]
 * 
 * ************************************************************* 
 * 
 * Input: root = []
 * 
 * Output: []
 * 
 * *************************************************************
 * 
 * Input: root = [1]
 * 
 * Output: [1]
 * 
 * *************************************************************
 * Time Complexity: O(n)
 * Space Complexity: O(h)
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
class Postorder {
  /**
   * Time Complexity: O(n)
   *   - Nodes of tree.
   * Space Complexity: O(h)
   *   - Stack: Height of tree.
   */
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list = new LinkedList<>();
    if (root == null) return list;
    list.addAll(postorderTraversal(root.left));
    list.addAll(postorderTraversal(root.right));
    list.add(root.val);
    return list;
  }
}