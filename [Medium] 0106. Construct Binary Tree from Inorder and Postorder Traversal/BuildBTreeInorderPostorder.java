/**
 * Problem
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
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
class BuildBTreeInorderPostorder {
  /**
   * Time O(n)
   * Space O(n)
   *  - O(h), tree high
   *  - O(n), full tree
   */
  private TreeNode build(int[] inorder, int inS, int inE, int[] postorder, int postS, int postE) {
    if (inS > inE) return null;
    int pivot = 0;
    for (int i = inS; i <= inE; i++) {
      if (postorder[postE] == inorder[i]) {
        pivot = i;
        break;
      }
    }
    
    TreeNode node = new TreeNode(postorder[postE]);
    
    node.left = build(inorder, inS, pivot - 1, postorder, postS, postE - (inE - pivot) - 1);
    node.right = build(inorder, pivot + 1, inE, postorder, postE - (inE - pivot), postE - 1);
    
    return node;
  }

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
  }
}


/**
 * Wonderful Solution
 */
class BuildBTreePreorderInorderWonderful {
  private int inIdx = 0;
  private int postIdx = 0;

  /**
   * Time O(n)
   * Space O(n)
   */
  private TreeNode build(int[] inorder, int[] postorder, int pivot) {
    if (postIdx < 0) return null;
    if (inorder[inIdx] == pivot) {
      inIdx--;
      return null;
    }

    TreeNode node = new TreeNode(postorder[postIdx--]);

    node.right = build(inorder, postorder, node.val);
    node.left = build(inorder, postorder, pivot);

    return node;
  }

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    inIdx = inorder.length - 1;
    postIdx = postorder.length - 1;
    return build(inorder, postorder, Integer.MIN_VALUE);
  }
}