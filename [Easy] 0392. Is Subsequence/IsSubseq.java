class IsSubseq {
  /**
   * Time O(st)
   * Space O(st)
   */
  public boolean isSubsequence(String s, String t) {
    // Space O(st)
    int[][] dp = new int[s.length() + 1][t.length() + 1];
    
    // Time O(st)
    for (int i = 1; i <= s.length(); i++) {
      for (int j = 1; j <= t.length(); j++) {
        if (s.charAt(i - 1) == t.charAt(j - 1)) {
          dp[i][j] = 1 + dp[i - 1][j - 1];
        } else {
          dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
        }
      }
    }
    
    return s.length() == dp[s.length()][t.length()];
  }
}