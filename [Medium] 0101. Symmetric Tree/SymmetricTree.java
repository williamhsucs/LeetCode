/**
 * Problem
 * https://leetcode.com/problems/symmetric-tree/
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
class SymmetricTree {
  // Space O(h)
  private void postOrder(TreeNode node, List<Integer> list, boolean isMirrow) {
    if (node == null) {
      list.add(null);
      return;
    }
    if (isMirrow) {
      postOrder(node.right, list, isMirrow);
      postOrder(node.left, list, isMirrow);
    } else {
      postOrder(node.left, list, isMirrow);
      postOrder(node.right, list, isMirrow);
    }
    list.add(node.val);
  }

  public boolean isSymmetric(TreeNode root) {
    // Space O(n)
    List<Integer> listL = new ArrayList<>();
    List<Integer> listR = new ArrayList<>();
    postOrder(root.left, listL, false);
    postOrder(root.right, listR, true);
    if (listL.size() != listR.size()) return false;
    for (int i = 0; i < listL.size(); i++) {
      if (listL.get(i) != listR.get(i)) return false;
    }
    return true;
  }
}

/**
 * Wonderful Solution
 * Author: lvlolitte
 */
/**
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
class SymmetricTreeLvlolitte {
  public boolean isSymmetric(TreeNode root) {
    return root==null || isSymmetricHelp(root.left, root.right);
  }

  private boolean isSymmetricHelp(TreeNode left, TreeNode right){
    if(left==null || right==null)
        return left==right;
    if(left.val!=right.val)
        return false;
    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
  }
}