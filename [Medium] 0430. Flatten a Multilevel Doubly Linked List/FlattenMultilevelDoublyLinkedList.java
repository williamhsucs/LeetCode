/**
 * Problem
 * https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * 
 * Output: [1,2,3,7,8,11,12,9,10,4,5,6]
 * 
 * Explanation: The multilevel linked list in the input is shown.
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2,null,3]
 * 
 * Output: [1,3,2]
 * 
 * Explanation: The multilevel linked list in the input is shown.
 * 
 * ************************************************************* 
 * 
 * Input: head = []
 * 
 * Output: []
 * 
 * Explanation: There could be empty list in the input.
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class FlattenMultilevelDoublyLinkedList {
  public Node checkLastChild(Node head) {
    Node node = head;
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     *   - height of tree
     */
    while (node != null) {
      if (node.child != null) {
        if (node.next == null) {
          /** 
           * At the tail of list,
           * So we can connect child list directly.
           * e.g.
           * 1 -> null
           * 2 -> 3 -> 4 -> null
           * 
           * connect child list
           * 1 -> 2 -> 3 -> 4 -> null
           */
          node.next = node.child;
          node.child = null;
          node.next.prev = node;
          node = node.next;
        } else {
          /**
           * e.g.
           *     node  temp
           * 1 -> 2 -> 3 -> null
           *      4 -> 5 -> null
           *           * find child list last node is 5
           */
          Node temp = node.next;
          node.next.prev = checkLastChild(node.child);
          node.next.prev.next = node.next;
          node.next = node.child;
          node.child = null;
          node.next.prev = node;
          node = temp;
        }
      } else if (node.next != null) {
        // No child, keep going same level list
        node = node.next;
      } else {
        break;
      }
    }
    return node;
  }
  
  public Node flatten(Node head) {
    if (head == null) return head;
    checkLastChild(head);
    return head;
  }
}