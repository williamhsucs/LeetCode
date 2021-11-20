/**
 * Problem
 * https://leetcode.com/problems/add-two-numbers/
 * 
 * ************************************************************* 
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * 
 * Output: [7,0,8]
 * 
 * Explanation: 342 + 465 = 807.
 * 
 * ************************************************************* 
 * 
 * Input: l1 = [0], l2 = [0]
 * 
 * Output: [0]
 * 
 * ************************************************************* 
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 
 * Output: [8,9,9,9,0,0,0,1]
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
class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    boolean carry = false;
    ListNode head = l1;
    ListNode pre = null;
  
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    while (l1 != null && l2 != null) {
      if (carry) {
        l1.val = l1.val + l2.val + 1;
      } else {
        l1.val = l1.val + l2.val;
      }
      if (l1.val > 9) {
        carry = true;
        l1.val = l1.val - 10;
      } else {
        carry = false;
      }
      pre = l1;
      l1 = l1.next;
      l2 = l2.next;
    }
    
    if (l1 == null && l2 == null && carry) {
      pre.next = new ListNode(1);
    } else if (l1 == null) {
      pre.next = l2;
      checkCarry(l2, carry);
    } else {
      checkCarry(l1, carry);
    }
    
    return head; 
  }
  
  /**
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  private void checkCarry(ListNode node, boolean carry) {
    while (carry) {
      node.val = node.val + 1;
      if (node.val > 9) {
        carry = true;
        node.val = node.val - 10;
        if (node.next == null) node.next = new ListNode();
      } else {
        carry = false;
      }
      node = node.next;
    }
  }
}