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
class Solution {
  /**
   * Time O(n)
   * Space O(1)
   */
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) return head;
    int size = 0;
    ListNode node = head;
    ListNode tail = null;
    ListNode newHead = null;
    
    // Time O(n)
    while (node != null) {
      node = node.next;
      size++;
    }
    
    k = size - (k % size) - 1;
    
    if (k == size) return head;
    
    node = head;
    // Time O(n)
    while (k-- > 0) {
      node = node.next;
    }
    
    tail = node;
    if (node.next == null) {
      newHead = head;
    } else {
      newHead = node.next;
    }
    
    // Time O(n)
    while (node.next != null) {
      node = node.next;
    }
    
    node.next = head;
    tail.next = null;
    
    return newHead;
  }
}