import java.util.LinkedList;
import java.util.Queue;

class MyStack {

  private Queue<Integer> queue;

  public MyStack() {
    queue = new LinkedList<>();
  }

  // Time O(n)
  public void push(int x) {
    queue.offer(x);
    // Time O(n)
    for (int i = 0; i < queue.size() - 1; i++) {
      // Time O(1)
      queue.offer(queue.poll());
    }
  }

  // Time O(1)
  public int pop() {
    return queue.poll();
  }

  // Time O(1)
  public int top() {
    return queue.peek();
  }

  // Time O(1)
  public boolean empty() {
    return queue.isEmpty();
  }
}