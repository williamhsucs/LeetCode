class MinStack {

  private int min;
  private List<Integer> stack;

  public MinStack() {
    stack = new ArrayList<>();
  }
  
  public void push(int val) {
    if (stack.isEmpty()) {
      min = val;
    } else {
      min = val < min ? val : min;
    }
    stack.add(val);
  }
  
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
  
  public int top() {
    return stack.get(stack.size() - 1);
  }
  
  public int getMin() {
    return min;
  }
}