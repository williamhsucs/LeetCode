/**
 * Problem
 * https://leetcode.com/problems/design-circular-queue/
 * 
 * Input
 *   ["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
 *   [[3], [1], [2], [3], [4], [], [], [], [4], []]
 * Output
 *   [null, true, true, true, false, 3, true, true, true, 4]
 * 
 * Explanation
 * MyCircularQueue myCircularQueue = new MyCircularQueue(3);
 * myCircularQueue.enQueue(1); // return True
 * myCircularQueue.enQueue(2); // return True
 * myCircularQueue.enQueue(3); // return True
 * myCircularQueue.enQueue(4); // return False
 * myCircularQueue.Rear();     // return 3
 * myCircularQueue.isFull();   // return True
 * myCircularQueue.deQueue();  // return True
 * myCircularQueue.enQueue(4); // return True
 * myCircularQueue.Rear();     // return 4
 * 
 * *************************************************************
 * Queues (FIFO)
 * 
 * Time complexity: O(1)
 *  enQueue: O(1)
 *  deQueue: O(1)
 *  peek: O(1)
 * Space complexity: O(n)
 */

class MyCircularQueue {
  final int[] a;
  int front = 0;
  int rear = -1;
  int length = 0;

  public MyCircularQueue(int k) {
    this.a = new int[k];
  }

  public boolean enQueue(int value) {
    if (!isFull()) {
      this.rear = (this.rear + 1) % this.a.length;
      this.a[this.rear] = value;
      this.length++;
      return true;
    }
    return false;
  }

  public boolean deQueue() {
    if (!isEmpty()) {
      this.front = (this.front + 1) % this.a.length;
      this.length--;
      return true;
    }
    return false;
  }

  public int Front() {
    return isEmpty() ? -1 : this.a[this.front];
  }

  public int Rear() {
    return isEmpty() ? -1 : this.a[this.rear];
  }

  public boolean isEmpty() {
    return this.length == 0;
  }

  public boolean isFull() {
    return this.length == a.length;
  }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k); boolean param_1 =
 * obj.enQueue(value); boolean param_2 = obj.deQueue(); int param_3 =
 * obj.Front(); int param_4 = obj.Rear(); boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

class Main {
  public static void show(MyLinkedList linkedList) {
  }

  public static void main(String[] args) {

  }
}