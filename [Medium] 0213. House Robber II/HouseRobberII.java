class HouseRobberII {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int rob(int[] nums) {
    if (nums.length == 1) return nums[0];
    if (nums.length == 2) return Math.max(nums[0], nums[1]);
    
    // Space O(n)
    int[] dp1 = new int[nums.length - 1];
    int[] dp2 = new int[nums.length];
    
    dp1[0] = nums[0];
    dp1[1] = Math.max(nums[0], nums[1]);
    
    dp2[1] = nums[1];
    dp2[2] = Math.max(nums[1], nums[2]);

    // Time O(n)
    for (int i = 2; i < nums.length; i++) {
      if (i < nums.length - 1) dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
      if (i > 2 && i < nums.length) dp2[i] = Math.max(dp2[i - 2] + nums[i], dp2[i - 1]);
    }

    return Math.max(dp1[dp1.length - 1], dp2[dp2.length - 1]);
  }
}