/**
 * Problem
 * https://leetcode.com/problems/insert-into-a-binary-search-tree/
 * 
 * ************************************************************* 
 * 
 * Input:
 * root = [40,20,60,10,30,50,70], val = 25
 * 
 * Output:
 * [40,20,60,10,30,50,70,null,null,25]
 * 
 * ************************************************************* 
 * 
 * Input:
 * root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
 * 
 * Output:
 * [4,2,7,1,3,5]
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
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
class InsertBST {
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null) return new TreeNode(val);
    TreeNode cur = root;
    while (cur != null) {
      if (val < cur.val) {
        if (cur.left != null) {
          cur = cur.left;
        } else {
          cur.left = new TreeNode(val);
          break;
        }
      } else {
        if (cur.right != null) {
          cur = cur.right;
        } else {
          cur.right = new TreeNode(val);
          break;
        }
      }
    }
    return root;
  }
}