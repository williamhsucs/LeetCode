/**
 * Problem
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * 
 * ************************************************************* 
 * 
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * 
 * Output: 6
 * 
 * Explanation: The LCA of nodes 2 and 8 is 6.
 * 
 * ************************************************************* 
 * 
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * 
 * Output: 2
 * 
 * Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 * 
 * ************************************************************* 
 * 
 * Input: root = [2,1], p = 2, q = 1
 * 
 * Output: 2
 * 
 * ************************************************************* 
 * Time Complexity: O(h)
 * Space Complexity: O(1)
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
  /**
   * Time Complexity: O(h)
   *   - - Height of the tree
   * Space Complexity: O(1)
   *   - no other space used
   */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    while (root != null) {
      if (p.val < root.val && q.val < root.val) {
        root = root.left;
      } else if (p.val > root.val && q.val > root.val) {
        root = root.right;
      } else {
        return root;
      }
    }
    return root;
  }
}