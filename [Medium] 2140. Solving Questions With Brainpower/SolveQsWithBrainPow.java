class SolveQsWithBrainPowDFS {
  long[] memo;
  int[][] qs;
  
  /**
   * Time O(n)
   * Space O(n)
   */
  public long mostPoints(int[][] questions) {
    memo = new long[questions.length];
    qs = questions;
    return dp(0);
  }
  
  /**
   * Time O(n)
   * Space O(n)
   */
  private long dp(int n) {
    if (n > qs.length - 1) {
      return 0;
    }
    if (n == qs.length - 1) {
      return qs[n][0];
    }
    if (memo[n] == 0) {
      memo[n] = Math.max(qs[n][0] + dp(n + 1 + qs[n][1]), dp(n + 1));
    }
    return memo[n];
  }
}

class SolveQsWithBrainPowIterative {
  /**
   * Time O(n)
   * Space O(n)
   */
  public long mostPoints(int[][] questions) {
    // Space O(n)
    long[] dp = new long[questions.length];
    dp[questions.length - 1] = questions[questions.length - 1][0];
    // Time O(n)
    for (int i = questions.length - 2; i >= 0; i--) {
      int idx = i + 1 + questions[i][1];
      if (idx < questions.length) {
        dp[i] = Math.max(questions[i][0] + dp[idx], dp[i + 1]);
      } else {
        dp[i] = Math.max(questions[i][0], dp[i + 1]);
      }
    }
    return dp[0];
  }
}