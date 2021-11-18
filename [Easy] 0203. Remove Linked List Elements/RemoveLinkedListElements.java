/**
 * Problem
 * https://leetcode.com/problems/isomorphic-strings/
 * 
 * ************************************************************* 
 * 
 * Input: s = "egg", t = "add"
 * 
 * Output: true
 * 
 * ************************************************************* 
 * 
 * Input: s = "foo", t = "bar"
 * 
 * Output: false
 * 
 * ************************************************************* 
 * 
 * Input: s = "paper", t = "title"
 * 
 * Output: true
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveLinkedListElements {
  public ListNode removeElements(ListNode head, int val) {
    if (head == null) return null;
    ListNode root = new ListNode();
    ListNode cur = root;
    cur.next = head;
    // Time Complexity: O(n)
    while (cur.next != null) {
      if (cur.next.val == val) {
        cur.next = cur.next.next;
      } else {
        cur = cur.next;
      }
    }

    return root.next;
  }
}