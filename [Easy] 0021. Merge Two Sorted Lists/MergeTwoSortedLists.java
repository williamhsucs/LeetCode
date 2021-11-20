/**
 * Problem
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * 
 * ************************************************************* 
 * 
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * 
 * Output: [1,1,2,3,4,4]
 * 
 * ************************************************************* 
 * 
 * Input: l1 = [], l2 = []
 * 
 * Output: []
 * 
 * ************************************************************* 
 * 
 * Input: l1 = [], l2 = [0]
 * 
 * Output: [0]
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
class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode head = new ListNode();
    ListNode cur = head;
    
    // Time Complexity: O(n)
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        cur.next = l1;
        l1 = l1.next;
      } else {
        cur.next = l2;
        l2 = l2.next;
      }
      cur = cur.next;
    }
    
    if (l1 == null) {
      cur.next = l2;
    } else {
      cur.next = l1;
    }
    
    return head.next;
  }
}