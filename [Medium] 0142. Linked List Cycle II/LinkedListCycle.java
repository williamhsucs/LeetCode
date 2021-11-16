/**
 * Problem
 * https://leetcode.com/problems/linked-list-cycle-ii/
 * 
 * ************************************************************* 
 * 
 * Input: head = [3,2,0,-4], pos = 1
 * 
 * Output: tail connects to node index 1
 * 
 * Explanation:
 * There is a cycle in the linked list, where tail connects to the second node.
 * 
 * ************************************************************* 
 * 
 * Input: head = [1,2], pos = 0
 * 
 * Output: tail connects to node index 0
 * 
 * Explanation: 
 * There is a cycle in the linked list, where tail connects to the first node.
 * 
 * ************************************************************* 
 * 
 * Input: head = [1], pos = -1
 * 
 * Output: no cycle
 * 
 * Explanation: 
 * There is no cycle in the linked list.
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
/**
 * Solve Explanation:
 * Thinking about
 * 1. How far did the turtle go?
 * 2. How far did the hare go?
 * 3. The relationship between two distance?
 * 
 * Assume that
 * 1. Start point is p1
 * 2. Cycle begin point is p2
 * 3. Meet point is p3
 * 
 * First distance p1 to p2 is x
 * Second distance p2 to p3 is y
 * Third distance p3 to p1 is z
 * 
 * Back to question
 * 1. How far did the turtle go?
 *    x + y ... then they Meet
 * 2. How far did the hare go?
 *    x + y + z + y ... then they Meet
 * 3. The relationship between two distance?
 *    Hare is 2 times faster then turtle. so,
 *    x + 2y + z = 2(x + y)
 *    => x + 2y + z = 2x + 2y
 *    => x + z = 2x
 *    => z = x
 *    The distance from start point to the cycle begin
 *    is equal to
 *    the distance from meet point to the cycle begin
 * 
 * Therefore, we can put one turtle back to start point and remain one turtle at the meet point
 * Let two turtle walk in the same speed.
 * They will meet each other at the cycle begin.
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LinkedListCycle {
  public ListNode detectCycle(ListNode head) {
    ListNode hare = head;
    ListNode turtle = head;
    // Check cycle
    while (hare != null && hare.next != null) {
      hare = hare.next.next;
      turtle = turtle.next;
      if (hare == turtle) {
        // Exist cycle
        hare = head;
        while (hare != turtle) {
          // Find the cycle begins
          hare = hare.next;
          turtle = turtle.next;
        }
        return hare;
      }
    }
    // No cycle
    return null;
  }
}