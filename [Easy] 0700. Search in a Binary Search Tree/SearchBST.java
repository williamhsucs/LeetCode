/**
 * Problem
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * 
 * ************************************************************* 
 * 
 * Input: root = [4,2,7,1,3], val = 2
 * 
 * Output: [2,1,3]
 * 
 * ************************************************************* 
 * 
 * Input: root = [4,2,7,1,3], val = 5
 * 
 * Output: []
 * 
 * ************************************************************* 
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
class Solution {
  /**
   * Recursion
   * Time Complexity: O(logn)
   * Space Complexity: O(h)
   */
  public TreeNode recursionBST(TreeNode root, int val) {
    if (root == null) return null;
    if (val < root.val) return recursionBST(root.left, val);
    if (val > root.val) return recursionBST(root.right, val);
    if (root.val == val) return root;
    return root;
  }
  /**
   * Iteration
   * Time Complexity: O(logn)
   * Space Complexity: O(1)
   */
  public TreeNode iterationBST(TreeNode root, int val) {
    while (root != null && root.val != val) {
      if (val < root.val) {
        root = root.left;
      } else if (val > root.val) {
        root = root.right;
      }
    }
    return root;
  }
}