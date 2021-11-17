/**
 * Problem
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2,3,4,5], n = 2
 * 
 * Output: [1,2,3,5]
 * 
 * ************************************************************* 
 * 
 * Input: head = [1], n = 1
 * 
 * Output: []
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2], n = 1
 * 
 * Output: [1]
 * 
 * ************************************************************* 
 * Time Complexity: O()
 * Space Complexity: O()
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
class RemoveNodeEndList {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head.next == null) return null;
    ListNode run = head;
    ListNode walk = head;
    ListNode pre = new ListNode(0, walk);
    for (;n >= 0; n--) {
      if (run == null) {
        return head.next;
      }
      run = run.next;
    }
    while (run != null) {
      run = run.next;
      walk = walk.next;
    }
    walk.next = walk.next.next;
    return pre.next;
  }
}