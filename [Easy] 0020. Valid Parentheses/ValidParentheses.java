public class ValidParentheses {
  /**
   * Time O(n)
   * Space O(n)
   */
  public boolean isValid(String s) {
    if (s.length() % 2 != 0) return false;
    // Space O(n)
    Stack<Character> stack = new Stack<>();
    // Time O(n)
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (c) {
        case ')':
          if (stack.isEmpty() || !stack.pop().equals('(')) return false;
          break;
        case ']':
          if (stack.isEmpty() || !stack.pop().equals('[')) return false;
          break;
        case '}':
          if (stack.isEmpty() || !stack.pop().equals('{')) return false;
          break;
        default:
          stack.push(c);
          break;
      }
    }
    return stack.isEmpty();
  }
}