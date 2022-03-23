class TrapRainWaterTwoPointer {
  /**
   * Time O(n)
   * Space O(1)
   */
  public int trap(int[] height) {
    int left = 0, leftMax = 0;
    int right = height.length - 1, rightMax = 0;
    int sum = 0;
    // Time O(n)
    while (left <= right) {
      if (height[left] <= height[right]) {
        if (height[left] >= leftMax) leftMax = height[left];
        else sum += (leftMax - height[left]);
        left++;
      } else {
        if (height[right] >= rightMax) rightMax = height[right];
        else sum += (rightMax - height[right]);
        right--;
      }
    }
    return sum;
  }
}

class TrapRainWaterDP {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int trap(int[] height) {
    int sum = 0;
    // Space O(n)
    int[] left = new int[height.length];
    int[] right = new int[height.length];
    left[0] = height[0];
    // Time O(n)
    for (int i = 1; i < height.length; i++) {
      left[i] = Math.max(height[i], left[i - 1]);
    }
    right[height.length - 1] = height[height.length - 1];
    // Time O(n)
    for (int i = height.length - 2; i >= 0; i--) {
      right[i] = Math.max(height[i], right[i + 1]);
    }
    // Time O(n)
    for (int i = 0; i < height.length; i++) {
      sum += Math.min(left[i], right[i]) - height[i];
    }
    return sum;
  }
}

class TrapRainWaterStack {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int trap(int[] height) {
    int sum = 0;
    // Space O(n)
    Stack<Integer> st = new Stack<>();
    // Time O(n)
    for (int i = 0; i < height.length; i++) {
      while (!st.isEmpty() && height[i] > height[st.peek()]) {
        int top = st.pop();
        if (st.isEmpty()) break;
        int distance = i - st.peek() - 1;
        int margin = Math.min(height[i], height[st.peek()]) - height[top];
        sum += distance * margin;
      }
      st.push(i);
    }
    return sum;
  }
}