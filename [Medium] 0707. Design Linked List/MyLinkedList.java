/**
 * Problem
 * https://leetcode.com/problems/design-linked-list/
 * 
 * Input:
 * ["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
 * [[], [1], [3], [1, 2], [1], [1], [1]]
 * 
 * Output:
 * [null, null, null, null, 2, null, 3]
 * 
 * Explanation
 * MyLinkedList myLinkedList = new MyLinkedList();
 * myLinkedList.addAtHead(1);
 * myLinkedList.addAtTail(3);
 * myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
 * myLinkedList.get(1);              // return 2
 * myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
 * myLinkedList.get(1);              // return 3
 * 
 * *************************************************************
 * Time complexity:
 *  - Search
 *      get       -> O(n)
 *  - Insert
 *      addAtHead -> O(1)
 *      addAtTail -> O(n)
 *      addAtIndex-> O(n)
 *  - Delete
 *      delete    -> O(n)
 * Worst case:
 * addAtHead only need to use head to add the nodes. O(1)
 * addAtTail, addAtIndex and delete need to use search to find the index. O(n)
 * *************************************************************
 * Space complexity:
 * O(n)
 * *************************************************************
 */
class MyLinkedList {
  class Node {
    int val;
    Node next;

    public Node() {
      this.val = 0;
      this.next = null;
    }

    public Node(int val, Node next) {
      this.val = val;
      this.next = next;
    }
  }

  public int size;
  private Node head;

  /** Initialize your data structure here. */
  public MyLinkedList() {
    this.size = 0;
    this.head = new Node(0, null);
  }

  /**
   * Get the value of the index-th node in the linked list. If the index is
   * invalid, return -1.
   */
  public int get(int index) {
    /**
     * index => [0,1,2,3,4,5]
     * size  =>  `--- 6 ---′
     * if index == size -> overflow
     */
    if (index >= this.size) {
      return -1;
    }
    /**
     * node = this.head => index at 0
     */
    Node node = this.head;
    /**
     * If index = 1;
     * (i => 0) < (index => 1)
     */
    for (int i = 0; i < index; i++) {
      /**
       * node index 0 will point to node index 1
       * And i++ -> (i => 1) !< (index => 1) -> break
       */
      node = node.next;
    }
    /**
     * Return the value of node index 1
     */
    return node.val;
  }

  /**
   * Add a node of value val before the first element of the linked list. After
   * the insertion, the new node will be the first node of the linked list.
   */
  public void addAtHead(int val) {
    Node node = this.head;
    this.head = new Node(val, node);
    this.size++;
  }

  /** Append a node of value val to the last element of the linked list. */
  public void addAtTail(int val) {
    if (this.size == 0) {
      this.addAtHead(val);
    } else {
      Node node = this.head;
      for (int i = 0; i < this.size - 1; i++) {
        node = node.next;    
      }
      node.next = new Node(val, null);
      this.size++;
    }
  }

  /**
   * Add a node of value val before the index-th node in the linked list. If index
   * equals to the length of linked list, the node will be appended to the end of
   * linked list. If index is greater than the length, the node will not be
   * inserted.
   */
  public void addAtIndex(int index, int val) {
    if (index > this.size) {
      return;
    }
    if (index == 0) {
      this.addAtHead(val);
    } else if (index == this.size) {
      this.addAtTail(val);
    } else {
      Node node = this.head;
      for (int i = 0; i < index; i++) {
        node = node.next;
      }
      node.next = new Node(node.val, node.next);
      node.val = val;
      this.size++;
    }
  }

  /** Delete the index-th node in the linked list, if the index is valid. */
  public void deleteAtIndex(int index) {
    if (index >= this.size) {
      return;
    } else if (index == 0) {
      this.head = this.head.next;
    } else if (index == this.size) {
      Node node = this.head;
      for (int i = 0; i < index - 1; i++) {
        node = node.next;
      }
      node.next = null;
    } else {
      Node node = this.head;
      for (int i = 0; i < index - 1; i++) {
        node = node.next;
      }
      node.next = node.next.next;
    }
    size--;
  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


/*
class Main {
  public static void show(MyLinkedList linkedList) {
    for (int i = 0; i < linkedList.size; i++) {
      System.out.println("index " + i + " = " + linkedList.get(i));
    }
    System.out.println();
  }
  public static void main(String[] args) {

    MyLinkedList linkedList = new MyLinkedList();

    String funcAry[] = {"addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"};
  
    int valAry[] = {2,1,2,7,3,2,5,5,5,6,4};
  
    for (int i = 0; i < funcAry.length; i++) {
      if ("addAtHead".equals(funcAry[i])) {
        linkedList.addAtHead(valAry[i]);

      } else if ("addAtTail".equals(funcAry[i])) {
        linkedList.addAtTail(valAry[i]);

      } else if ("deleteAtIndex".equals(funcAry[i])) {
        linkedList.deleteAtIndex(valAry[i]);

      } else if ("get".equals(funcAry[i])) {
        System.out.println(linkedList.get(valAry[i]));

      }
      show(linkedList);
    }
  }
}
*/