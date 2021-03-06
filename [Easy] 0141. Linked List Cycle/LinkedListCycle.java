/**
 * Problem
 * https://leetcode.com/problems/linked-list-cycle/
 * 
 * ************************************************************* 
 * 
 * Input: head = [3,2,0,-4], pos = 1
 * 
 * Output: true
 * 
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2], pos = 0
 * 
 * Output: true
 * 
 * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 * 
 * *************************************************************
 * 
 * Input: Input: head = [1], pos = -1
 * 
 * Output: false
 * 
 * Explanation: There is no cycle in the linked list.
 * 
 * *************************************************************
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LinkedListCycle {
  /**
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   *   - Always constant memory
   */
  public boolean hasCycle(ListNode head) {
    ListNode turtle = head;
    ListNode hare = head;
    while (hare != null && hare.next != null) {
      hare = hare.next.next;
      turtle = turtle.next;
      if (hare == turtle) {
        return true;
      }
    }
    return false;
  }
}