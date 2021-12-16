/**
 * Problem
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
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
  public TreeNode build(int[] preorder, int preS, int preE, int[] inorder, int inS, int inE) {
    if (inS > inE || preS > preE) return null;
    int pivot = 0;
    for (int i = inS; i <= inE; i++) {
      if (preorder[preS] == inorder[i]) {
        pivot = i;
        break;
      }
    }
    
    TreeNode node = new TreeNode(preorder[preS]);
    
    node.left = build(preorder, preS + 1, preS + (pivot - inS), inorder, inS, pivot - 1);
    node.right = build(preorder, preS + 1 + (pivot - inS), preE, inorder, pivot + 1, inE);
    return node;
  }
  
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
  }
}


/**
 * Wonderful Solution
 */
class BuildBTreeInorderPostorderWonderful {
  private int inIdx = 0;
  private int preIdx = 0;

  /**
   * Time O(n)
   * Space O(n)
   */
  private TreeNode build(int[] preorder, int[] inorder, int pivot) {
      if (preIdx >= preorder.length) return null;
      if (inorder[inIdx] == pivot) {
          inIdx++;
          return null;
      }
      TreeNode root = new TreeNode(preorder[preIdx++]);
      root.left = build(preorder, inorder, root.val);
      root.right = build(preorder, inorder, pivot);
      return root;        
  }

  public TreeNode buildTree(int[] preorder, int[] inorder) {
      return build(preorder, inorder, Integer.MIN_VALUE);
  }
}