public class Solution {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int[] dailyTemperatures(int[] temperatures) {
    if (temperatures.length == 1) return new int[0];
    int[] answer = new int[temperatures.length];
    // Space O(n)
    Stack<Integer> stack = new Stack<>();
    /**
     * Time O(n)
     *  - Traverse the temperatures array once and each item will push into stack.
     *  - Stack item only pop out while current temperature warmer than past.
     *    So, the time cost nearly O(2n).
     */
    for (int i = 0; i < temperatures.length; i++) {
      int temp = temperatures[i];
      while (!stack.isEmpty() && (temp > temperatures[stack.peek()])) {
        int j = stack.pop();
        answer[j] = i - j;
      }
      stack.push(i);
    }
    return answer;
  }
}