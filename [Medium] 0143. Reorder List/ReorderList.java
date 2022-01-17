class ReorderList {
  /**
   * Time O(n)
   * Space O(1)
   */
  public void reorderList(ListNode head) {
    // Step 1, Find middle of list
    ListNode walk = head;
    ListNode run = head;
    ListNode cur = head;
    
    // Time O(n)
    while (run.next != null && run.next.next != null) {
      run = run.next.next;
      walk = walk.next;
    }
    
    if (run.next != null) {
      run = run.next;
      walk = walk.next;
    }
    
    // Time O(n)
    // Step 2, Reverse from middle to last
    walk = reverse(walk);
    
    // Time O(n)
    // Step 3, Merge
    merge(cur, walk);
  }
  
  private ListNode reverse(ListNode node) {
    ListNode pre = null;
    ListNode cur = node;
    ListNode next = null;
    
    while (cur != null) {
      next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    
    return pre;
  }
  
  private void merge(ListNode list1, ListNode list2) {
    ListNode next = null;
    while (list1 != null && list2 != null) {
      next = list1.next;
      if (next == list2) break;
      list1.next = list2;
      list1 = next;
      next = list2.next;
      if (next == list1) break;
      list2.next = list1;
      list2 = next;
    }
  }
}