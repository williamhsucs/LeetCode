/**
 * Problem
 * https://leetcode.com/problems/binary-search-tree-iterator/
 * 
 * ************************************************************* 
 * 
 * Input:
 * ["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
 * [[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
 * 
 * Output:
 * [null, 3, 7, true, 9, true, 15, true, 20, false]
 * 
 * Explaination:
 * BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);
 * bSTterator.next();    // return 3
 * bSTIterator.next();    // return 7
 * bSTIterator.hasNext(); // return True
 * bSTIterator.next();    // return 9
 * bSTIterator.hasNext(); // return True
 * bSTIterator.next();    // return 15
 * bSTIterator.hasNext(); // return True
 * bSTIterator.next();    // return 20
 * bSTIterator.hasNext(); // return False
 * 
 * Could you implement next() and hasNext() to run in average O(1) time and use O(h) memory,
 * where h is the height of the tree?
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
class BSTIterator {
  
  Queue<Integer> queue;

  // Space Complexity: O(n + h)
  public BSTIterator(TreeNode root) {
    // Space Complexity: O(n)
    queue = new LinkedList<>();
    // Space Complexity: O(h)
    BST(root);
  }
  
  private void BST(TreeNode node) {
    if (node == null) return;
    /**
     * Time Complexity: O(n)
     *   - O(n), nodes of tree
     *   - O(1) LinkedList Queue offer
     * Space Complexity: O(h)
     *   - tree height, DFS -> stack
     */
    BST(node.left);
    queue.offer(node.val);
    BST(node.right);
  }

  public int next() {
    if (hasNext()) {
      /**
       * Time Complexity: O(1)
       *   - LinkedList Queue poll
       */
      return (Integer) queue.poll();
    }
    return 0;
  }

  public boolean hasNext() {
      /**
       * Time Complexity: O(1)
       *   - LinkedList Queue peek
       */
    if (queue.peek() == null) {
      return false;
    }
    return true;
  }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */