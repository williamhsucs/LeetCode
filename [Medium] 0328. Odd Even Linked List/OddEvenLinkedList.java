/**
 * Problem
 * https://leetcode.com/problems/odd-even-linked-list/
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2,3,4,5]
 * 
 * Output: [1,3,5,2,4]
 * 
 * ************************************************************* 
 * 
 * Input: head = [2,1,3,5,6,4,7]
 * 
 * Output: [2,3,6,7,1,5,4]
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
class OddEvenLinkedList {
  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null || head.next.next == null) {
      return head;
    }
    ListNode cur = head;
    ListNode oddTail = null;
    ListNode tail = null;

    // Time Complexity: O(n)
    while (cur != null) {
      if (cur.next != null) {
        cur = cur.next;
      } else {
        oddTail = cur;
        tail = cur;
        break;
      }
    }
    
    cur = head;
    // Time Complexity: O(n)
    while (cur != null) {
      tail.next = cur.next;
      tail = tail.next;
      cur.next = cur.next.next;
      tail.next = null;
      cur = cur.next;
      if (cur == oddTail || tail == oddTail) {
        break;
      }
    }

    return head;
  }
}


/**
 * Wonderful Solution
 * Author: harrison6
 */
public class OddEvenLinkedListHarrison6 {
  public ListNode oddEvenList(ListNode head) {
      if (head != null) {
      
          ListNode odd = head, even = head.next, evenHead = even; 
      
          while (even != null && even.next != null) {
              odd.next = odd.next.next; 
              even.next = even.next.next; 
              odd = odd.next;
              even = even.next;
          }
          odd.next = evenHead; 
      }
      return head;
  }
}