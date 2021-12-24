/**
 * Problem
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
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
   * Time: O(n), n nodes
   * Space: O(h), only use constant extra space.
   */
  public Node connect(Node root) {
    if (root == null) return null;

    Node child = null;
    if (root.left != null && root.right != null) {
      root.left.next = root.right;
      child = root.right;
    } else if (root.left != null) {
      child = root.left;
    } else if (root.right != null) {
      child = root.right;
    }

    if (child != null) {
      Node sibling = root.next;
      while (sibling != null && sibling.left == null && sibling.right == null) {
        sibling = sibling.next;
      }

      if (sibling != null) {
        if (sibling.left != null) {
          child.next = sibling.left;
        } else {
          child.next = sibling.right;
        }
      }
    }

    connect(root.right);
    connect(root.left);
    
    return root;
  }
}