public class Solution {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int evalRPN(String[] tokens) {
    // Space O(n)
    Stack<Integer> stack = new Stack<>();
    int x = 0;
    int y = 0;
    // Time O(n)
    for (String s : tokens) {
      if (s.equals("+")) {
        y = stack.pop();
        x = stack.pop();
        stack.push(x + y);
      } else if (s.equals("-")) {
        y = stack.pop();
        x = stack.pop();
        stack.push(x - y);
      } else if (s.equals("*")) {
        y = stack.pop();
        x = stack.pop();
        stack.push(x * y);
      } else if (s.equals("/")) {
        y = stack.pop();
        x = stack.pop();
        stack.push(x / y);
      } else {
        stack.push(Integer.parseInt(s));
      }
    }
    return stack.pop();
  }
  
}