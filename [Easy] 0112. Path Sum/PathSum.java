/**
 * Problem
 * https://leetcode.com/problems/path-sum/
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
class PathSum {
  /**
   * Time O(n)
   * Space O(h)
   */
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) return false;
    if (root.left == null && root.right == null && (targetSum - root.val == 0)) return true;
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
  }
}