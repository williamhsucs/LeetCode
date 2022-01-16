class HouseRobber {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int rob(int[] nums) {
    if (nums.length == 1) return nums[0];
    // Space O(n)
    int[] dp = new int[nums.length + 1];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);
    
    // Time O(n)
    for (int i = 2; i < nums.length; i++) {
      dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
    }
    return dp[nums.length - 1];
  }
}