class UniquePaths {
  /**
   * Time O(m*n)
   * Space O(m*n)
   */
  public int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];
    dp[0][0] = 1;
    // Time O(m*n)
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i > 0) dp[i][j] += dp[i - 1][j];
        if (j > 0) dp[i][j] += dp[i][j - 1];
      }
    }
    
    return dp[m - 1][n - 1];
  }
}