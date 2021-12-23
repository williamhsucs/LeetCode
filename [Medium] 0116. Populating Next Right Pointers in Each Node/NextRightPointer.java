/**
 * Problem
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
 * 
 * ************************************************************* 
 * Time Complexity: O(nlogn)
 * Space Complexity: O(h)
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class NextRightPointer {
  /**
   * Time: O(nlogn)
   *   - n nodes * tree high
   * Space: O(h), only use constant extra space.
   */
  public Node connect(Node root) {
    if (root != null && root.left != null) {
      root.left.next = root.right;
      Node left = root.left;
      Node right = root.right;
      while (left.right != null) {
        left.right.next = right.left;
        left = left.right;
        right = right.left;
      }
      connect(root.left);
      connect(root.right);
    }
    return root;
  }
}