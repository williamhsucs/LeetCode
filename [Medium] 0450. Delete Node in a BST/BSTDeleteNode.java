/**
 * Problem
 * https://leetcode.com/problems/delete-node-in-a-bst/
 * 
 * ************************************************************* 
 * 
 * Input: root = [5,3,6,2,4,null,7], key = 3
 * 
 * Output: [5,4,6,2,null,null,7]
 * 
 * Explanation: 
 * Given key to delete is 3. 
 * So we find the node with value 3 and delete it.
 * One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
 * Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
 * 
 * ************************************************************* 
 * 
 * Input: root = [5,3,6,2,4,null,7], key = 0
 * 
 * Output: [5,3,6,2,4,null,7]
 * 
 * Explanation:
 * The tree does not contain a node with value = 0.
 * 
 * ************************************************************* 
 * 
 * Input: root = [], key = 0
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
/**
 * Time Complexity: O(h)
 *   - Two method share the tree height
 * Space Complexity: O(1)
 */
class BSTDeleteNode {
  private TreeNode delNode(TreeNode node) {
    if (node == null) {
      // If tree is empty
      return null;
    }
    if (node.left == null) {
      // If node has only one child
      return node.right; 
    }
    if (node.right == null) {
      // If node has only one child
      return node.left;
    }
    /**
     * If node has two children
     * 
     * No need to handle all possible
     * Because every possible can complete the new tree
     */
    TreeNode pre = null;
    TreeNode cur = node.right;
    // Time Complexity: O(h)
    while (cur.left != null) {
      // Find the smallest node as a candidate and let it replace target node
      pre = cur;
      cur = cur.left;
    }
    
    // let target node left child become candidate node left child
    cur.left = node.left;

    if (node.right != cur) {
      /** 
       * If target node right child is not candidate node
       * Let candidate node current right child become it's parent node left child
       * Let target node right child parent become candidate node right child
       */
      pre.left = cur.right;
      cur.right = node.right;
    }
    return cur;
  }

  public TreeNode deleteNode(TreeNode root, int key) {
    // Find target node first
    TreeNode pre = null;
    TreeNode cur = root;
    // Time Complexity: O(h)
    while (cur != null && cur.val != key) {
      pre = cur;
      if (key < cur.val) {
        cur = cur.left;
      } else if (key > cur.val) {
        cur = cur.right;
      }
    }

    if (pre == null) {
      // If tree is empty or target node is root node
      return delNode(cur);
    }

    if (pre.left == cur) {
      // If target node is left child
      pre.left = delNode(cur);
    } else {
      // If target node is right child
      pre.right = delNode(cur);
    }
    return root;
  }
}