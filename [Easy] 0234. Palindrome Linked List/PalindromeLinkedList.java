/**
 * Problem
 * https://leetcode.com/problems/palindrome-linked-list/
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2,2,1]
 * 
 * Output: true
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2]
 * 
 * Output: false
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
/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class PalindromeLinkedList {
  public boolean isPalindrome(ListNode head) {
    if (head == null) return false;
    if (head.next == null) return true;
    ListNode pre = null;
    ListNode cur = head;
    ListNode next = null;
    ListNode run = head;
    /**
     * Time Complexity: O(n)
     *   - O(n/2), only run half link, find the middle position.
     */
    while (run != null) {
      if (run.next == null) {
        // If odd nodes, e.g. [1 -> 2 -> 1]
        next = cur.next;
        cur = pre;
        break;
      } else if (run.next.next != null) {
        // Progress
        run = run.next.next;
        next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
      } else {
        // If even nodes, e.g. [1 -> 2 -> 2 -> 1]
        next = cur.next;
        cur.next = pre;
        break;
      }
    }
    
    /**
     * Time Complexity: O(n)
     *   - O(n/2), go through left and right from middle position.
     */
    while (next != null) {
      if (cur.val != next.val) {
        return false;
      } else {
        cur = cur.next;
        next = next.next;
      }
    }
    return cur != null ? false : true;
  }
}