/**
  * The conditions are:
  * 
  * 1. The number of nodes must be greater than 3.
  *     0 -> n -> 0
  *
  * 2. There are no two consecutive nodes with Node.val == 0.
  *     Never 0 -> 0
  *
  * 3. The beginning and end of the linked list have Node.val == 0.
  *     0 -> x -> y -> z -> 0
  *
  * 4. The value of node accually not important. We only need to care about 0.
  * 
  *
  * List some examples:
  *  0 -> 1 -> 0
  *  0 -> 1 -> 1 -> 0 -> 1 -> 0
  * 
  * Think aloud:
  * 
  * 1. Start
  *   cur next
  *   0 -> 1 -> 1 -> 0 -> 1 -> 0 -> NULL
  *   sum: 0
  * 
  * 2. cur is 0, next is 1, add 1 to sum
  *   cur next
  *   0 -> 1 -> 1 -> 0 -> 1 -> 0 -> NULL
  *   sum: 1
  * 
  * 3. cur is 0, next is 1, add 1 to sum
  *   cur      next
  *   0 -> 1 -> 1 -> 0 -> 1 -> 0 -> NULL
  *   sum: 2
  * 
  * 4. cur is 0, next is 0
  *   cur           next
  *   0 -> 1 -> 1 -> 0 -> 1 -> 0 -> NULL
  *   sum: 2
  * 
  * 5. Assign sum vale to cur. Clear sum.
  *   cur           next
  *   2 -> 1 -> 1 -> 0 -> 1 -> 0 -> NULL
  *   sum: 0
  * 
  * 6. Point next node of cur to "next"
  *   cur            next
  *   2 ------------> 0 -> 1 -> 0 -> NULL
  *   sum: 0
  * 
  * 7. Loop until next.next is Null
  *                  cur  next
  *   2 ------------> 1 -> 0 -> NULL
  * 
  * 8. Point next node of cur to "next.next" (NULL)
  *                  cur  next
  *   2 ------------> 1 ------> NULL
  */
class MergeNodesBetweenZeros {
  /**
   * Time O(n)
   * Space O(1)
   */
  public ListNode mergeNodes(ListNode head) {
    ListNode cur = head;
    ListNode next = cur.next;
    int sum = 0;
    // Time O(n)
    while (cur != null && cur.next != null) {
      if (next.val == 0) {
        cur.val = sum;
        sum = 0;
        if (next.next == null) {
          cur.next = next.next;
          break;
        }
        cur.next = next;
        cur = cur.next;
        next = cur.next;
      }
      if (cur.val == 0 && next != null) {
        sum += next.val;
        next = next.next;
      }
    }
    
    return head;
  }
}