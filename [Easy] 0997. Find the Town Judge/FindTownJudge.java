class FindTownJudge {
  /**
   * Time O(t)
   * Space O(n)
   */
  public int findJudge(int n, int[][] trust) {
    int[] bucket = new int[n + 1];
    // Time O(t)
    for (int i = 0; i < trust.length; i++) {
      bucket[trust[i][0]]--;
      bucket[trust[i][1]]++;
    }
    // Time O(n)
    for (int i = 1; i <= n; i++) {
      if (bucket[i] == n - 1) {
        return i;
      }
    }
    return -1;
  }
}