class CombinationSumIV {
  /**
   * Time O(m * n)
   * Space O(n)
   */
  public int combinationSum4(int[] nums, int target) {
    // Space O(n)
    int[] dp = new int[target + 1];
    dp[0] = 1;
    
    // Time O(n)
    for (int i = 1; i <= target; i++) {
      // Time O(m)
      for (int num : nums) {
        if (i - num >= 0) dp[i] += dp[i - num];
      }
    }
    return dp[target];
  }
}