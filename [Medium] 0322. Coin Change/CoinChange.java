class CoinChange {
  /**
   * Time O(m * n)
   * Space O(n)
   */
  public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    dp[0] = 0;
    // Time O(n)
    for (int i = 1; i <= amount; i++) {
      int step = -1;
      // Time O(m)
      for (int coin : coins) {
        if (i - coin < 0 || dp[i - coin] < 0) continue;
        if (step < 0) step = dp[i - coin] + 1;
        else step = Math.min(step, dp[i - coin] + 1);
      }
      dp[i] = step;
    }
    return dp[amount];
  }
}