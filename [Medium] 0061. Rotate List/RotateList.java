/**
 * Problem
 * https://leetcode.com/problems/rotate-list/
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1))
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
class RotateList {
  /**
   * Time O(n)
   * Space O(1)
   */
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) return head;

    ListNode curr = head;
    int len = 1;

    // Time O(n)
    while (curr.next != null) {
      len++;
      curr = curr.next;
    }

    curr.next = head;
    k = len - k % len;

    // Time O(n)
    while (k-- > 0) curr = curr.next;

    head = curr.next;
    curr.next = null;

    return head;
  }
}