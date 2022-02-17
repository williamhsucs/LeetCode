/**
 * Time O(mn)
 * Space O(mn)
 */
class LongestCommSubseqTopDown {
  private int[][] dp;
  private String longS;
  private String shortS;
  private int l;
  private int s;
  
  public int dp(int i, int j) {
    if (i == l || j == s) {
      return 0; // Base Case
    }
    
    char c1 = longS.charAt(i);
    char c2 = shortS.charAt(j);
    
    if (dp[i][j] == 0) {
      if (c1 == c2) {
        dp[i][j] = 1 + dp(i + 1, j + 1);
      } else {
        dp[i][j] = Math.max(dp(i + 1, j), dp(i, j + 1));
      }
    }
    
    return dp[i][j];
  }
  
  public int longestCommonSubsequence(String text1, String text2) {
    if (text1.length() > text2.length()) {
      longS = text1;
      shortS = text2;
    } else {
      longS = text2;
      shortS = text1;
    }
    l = longS.length();
    s = shortS.length();
    dp = new int[l][s];
    return dp(0, 0);
  }
}

class LongestCommSubseqBottonUp {
  /**
   * Time O(mn)
   * Space O(mn)
   */
  public int longestCommonSubsequence(String text1, String text2) {
    int l = text1.length();
    int s = text2.length();
    int[][] dp = new int[l + 1][s + 1];
    for (int i = l - 1; i >= 0; i--) {
      for (int j = s - 1; j >= 0; j--) {
        char c1 = text1.charAt(i);
        char c2 = text2.charAt(j);
        if (dp[i][j] == 0) {
          if (c1 == c2) {
            dp[i][j] = 1 + dp[i + 1][j + 1];
          } else {
            dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
          }
        }
      }
    }
    return dp[0][0];
  }
}