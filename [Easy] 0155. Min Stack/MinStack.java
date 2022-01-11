class MinStack {
  private class Node {
    int min;
    int val;
    Node prev;
    
    public Node(int val, int min, Node node) {
      this.val = val;
      this.min = min;
      this.prev = node;
    }
  }
  
  private Node tail;
  
  // Time O(1)
  public int getMin() {
    return tail.min;
  }
  
  // Time O(1)
  public int top() {
    return tail.val;
  }
  
  /**
   * Time O(1)
   * Space O(1)
   */ 
  public void push(int val) {
    Node cur;
    if (tail == null) {
      cur = new Node(val, val, tail);
    } else {
      cur = new Node(val, Math.min(tail.min, val), tail);
    }
    tail = cur;
  }
  
  // Time O(1)
  public void pop() {
    tail = tail.prev;
  }
}

class MinStack2 {

  private int min;
  private List<Integer> stack;

  // Space O(n)
  public MinStack() {
    stack = new ArrayList<>();
  }
  
  // Time O(1)
  public void push(int val) {
    if (stack.isEmpty()) {
      min = val;
    } else {
      min = val < min ? val : min;
    }
    stack.add(val);
  }
  
  // Time O(n)
  public void pop() {
    int i = stack.get(stack.size() - 1);
    stack.remove(stack.size() - 1);
    if (i == min) {
      min = Integer.MAX_VALUE;
      for (Integer j : stack) {
        min = j < min ? j : min;
      }
    }
    
  }
  
  // Time O(1)
  public int top() {
    return stack.get(stack.size() - 1);
  }
  
  // Time O(1)
  public int getMin() {
    return min;
  }
}