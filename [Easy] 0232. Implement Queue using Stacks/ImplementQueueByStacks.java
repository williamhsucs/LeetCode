import java.util.Stack;

public class MyQueue1 {

  private Stack<Integer> stack;
  private Stack<Integer> reverse;

  public MyQueue() {
    stack = new Stack<>();
    reverse = new Stack<>();
  }
  
  // Time O(n)
  public void push(int x) {
    stack = new Stack<>();
    while (!reverse.isEmpty()) {
      stack.push(reverse.pop());
    }
    stack.push(x);
    for (int i = stack.size() - 1; i >= 0; i--) {
      reverse.push(stack.get(i));
    }
  }
  
  // Time O(1)
  public int pop() {
    return reverse.pop();
  }
  
  // Time O(1)
  public int peek() {
    return reverse.peek();
  }
  
  // Time O(1)
  public boolean empty() {
    return reverse.isEmpty();
  }
}

public class MyQueue2 {

  private Stack<Integer> stack;
  private Stack<Integer> reverse;

  public MyQueue() {
    stack = new Stack<>();
    reverse = new Stack<>();
  }
  
  // Time O(1)
  public void push(int x) {
    stack.push(x);
  }
  
  /**
   * Time O(1) - while reverse is not empty
   *      O(n) - while reverse is empty
   */
  public int pop() {
    peek();
    return reverse.pop();
  }
  
  /**
   * Time O(1) - while reverse is not empty
   *      O(n) - while reverse is empty
   */
  public int peek() {
    if (reverse.isEmpty()) {
      while (!stack.isEmpty()) {
        reverse.push(stack.pop());
      }
    }
    return reverse.peek();
  }
  
  // Time O(1)
  public boolean empty() {
    return stack.isEmpty() && reverse.isEmpty();
  }
}
