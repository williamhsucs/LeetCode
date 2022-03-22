class TrapRainWater {
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