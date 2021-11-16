/**
 * Problem
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * 
 * ************************************************************* 
 * 
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
 * 
 * Output: Intersected at '8'
 * 
 * Explanation: 
 * The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
 * From the head of A, it reads as [4,1,8,4,5].
 * From the head of B, it reads as [5,6,1,8,4,5].
 * There are 2 nodes before the intersected node in A;
 * There are 3 nodes before the intersected node in B.
 * 
 * ************************************************************* 
 * 
 * Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * 
 * Output: Intersected at '2'
 * 
 * Explanation:
 * The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
 * From the head of A, it reads as [1,9,1,2,4].
 * From the head of B, it reads as [3,2,4].
 * There are 3 nodes before the intersected node in A;
 * There are 1 node before the intersected node in B.
 * 
 * *************************************************************
 * 
 * Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
 * 
 * Output: No intersection
 * 
 * Explanation:
 * From the head of A, it reads as [2,6,4].
 * From the head of B, it reads as [1,5].
 * Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
 * The two lists do not intersect, so return null.
 * 
 * *************************************************************
 * Time Complexity: 
 * Space Complexity: 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class TwoLinkedLists {
  /**
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int m = 0; // size of list A
    int n = 0; // size of list B
    int skipA = 0;
    int skipB = 0;
    ListNode listA = headA;
    ListNode listB = headB;
    // Time Complexity: O(m)
    while (listA != null) {
      listA = listA.next;
      m++;
    }
    // Time Complexity: O(n)
    while (listB != null) {
      listB = listB.next;
      n++;
    }
    if (m > n) {
      skipB = m - n;
    } else {
      skipA = n - m;
    }
    // Time Complexity: O(m|n)
    while (headA != null) {
      if (skipA > 0) {
        skipA--;
        headB = headB.next;
      } else if (skipB > 0) {
        skipB--;
        headA = headA.next;
      } else {
        if (headA == headB) {
          return headA;
        }
        headA = headA.next;
        headB = headB.next;
      }
    }
    return null;
  }
}

/**
 * Wonderful Solution
 * Author: myfavcat
 */
public class TwoLinkedListsMyfavcat {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //boundary check
    if(headA == null || headB == null) return null;
    
    ListNode a = headA;
    ListNode b = headB;
    
    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){
      //for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null? headB : a.next;
        b = b == null? headA : b.next;    
    }
    
    return a;
  }
}

/**
*****************************************
            a
A:          a1 → a2
                   ↘
                     c1 → c2 → c3 → null
                   ↗            
B:     b1 → b2 → b3
       b
*****************************************
                 a
A:          a1 → a2
                   ↘
                     c1 → c2 → c3 → null
                   ↗            
B:     b1 → b2 → b3
            b
*****************************************
A:          a1 → a2
                   ↘ a
                     c1 → c2 → c3 → null
                   ↗            
B:     b1 → b2 → b3
                 b
*****************************************
A:          a1 → a2
                   ↘      a
                     c1 → c2 → c3 → null
                   ↗ b           
B:     b1 → b2 → b3
*****************************************
A:          a1 → a2
                   ↘           a
                     c1 → c2 → c3 → null
                   ↗      b           
B:     b1 → b2 → b3
*****************************************
A:          a1 → a2
                   ↘                a = null, then a = b1
                     c1 → c2 → c3 → null
                   ↗           b           
B:     b1 → b2 → b3
*****************************************
A:          a1 → a2
                   ↘ 
                     c1 → c2 → c3 → null
                   ↗                b = null, then b = a1 
B:     b1 → b2 → b3
       a
*****************************************
            b         
A:          a1 → a2
                   ↘ 
                     c1 → c2 → c3 → null
                   ↗
B:     b1 → b2 → b3
            a
*****************************************
                 b         
A:          a1 → a2
                   ↘ 
                     c1 → c2 → c3 → null
                   ↗ 
B:     b1 → b2 → b3
                 a
*****************************************
A:          a1 → a2
                   ↘ b
                     c1 → c2 → c3 → null
                   ↗ a
B:     b1 → b2 → b3 
*****************************************
 */