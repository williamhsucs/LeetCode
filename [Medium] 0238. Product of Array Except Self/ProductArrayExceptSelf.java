class ProductArrayExceptSelf {
  /**
   * Time O(n)
   * Space O(1)
   *  - The output array does not count as extra space for space complexity analysis.
   */
  public int[] productExceptSelf(int[] nums) {
    int[] ans = new int[nums.length];
    int tmp = 1;
    
    ans[0] = 1;
    // Time O(n)
    for (int i = 1; i < nums.length; i++) {
      ans[i] = ans[i - 1] * nums[i - 1];
    }

    // Time O(n)
    for (int i = nums.length - 1; i >= 0; i--) {
      ans[i] *= tmp;
      tmp *= nums[i];
    }
    
    return ans;
  }
}