class CountingBits {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int[] countBits(int n) {
    int count = 0;
    // Space O(n)
    int[] ans = new int[n + 1];
    
    // Time O(n)
    for (int i = 1; i <= n; i++) {
      count = 0;
      int num = i;
      // Time O(32), always count 32 digits
      while (num != 0) {
        count += (num & 1);
        num >>>= 1;
      }
      ans[i] = count;
    }
    
    return ans;
  }
}