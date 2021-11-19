/**
 * Problem
 * https://leetcode.com/problems/reverse-linked-list/
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2,3,4,5]
 * 
 * Output: [5,4,3,2,1]
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2]
 * 
 * Output: [2,1]
 * 
 * ************************************************************* 
 * 
 * Input: head = []
 * 
 * Output: []
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
class ReverseLinkedList1 {
  public ListNode reverseList(ListNode head) {
    ListNode root = new ListNode(0, head);
    ListNode node = head;
    ListNode temp = null;
    
    // Time Complexity: O(n)
    while (node.next != null) {
      temp = node.next.next;
      node.next.next = root.next;
      root.next = node.next;
      node.next = temp;
    }

    return root.next;
  }
}



/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class ReverseLinkedList2 {
  public ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode cur = head;
    ListNode next = null;

    // Time Complexity: O(n)
    while (cur != null) {
      next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    return pre;
  }
}