/**
 * Problem
 * https://leetcode.com/problems/validate-binary-search-tree/
 * 
 * ************************************************************* 
 * 
 * Input: root = [2,1,3]
 * Output: true
 * 
 * ************************************************************* 
 * 
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 * 
 * ************************************************************* 
 * Time Complexity: O(n), Check each node
 * Space Complexity: O(h), Tree height
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
class BST {
  private boolean isBST(TreeNode node, long min, long max) {
    if (node == null) {
      return true;
    }
    if (((long)node.val < min) || ((long)node.val > max)) {
      return false;
    }
    /**
     * Time Complexity: O(n), Check each node
     * Space Complexity: O(h), Tree height
     */
    return isBST(node.left, min, ((long)node.val - 1)) && isBST(node.right, ((long)node.val + 1), max);
  }

  public boolean isValidBST(TreeNode root) {
    return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
}