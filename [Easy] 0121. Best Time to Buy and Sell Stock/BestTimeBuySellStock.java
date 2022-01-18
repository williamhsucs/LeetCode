class BestTimeBuySellStock {
  /**
   * Time O(n)
   * Space O(1)
   */
  public int maxProfit(int[] prices) {
    int max = 0;
    int sum = 0;

    // Time O(n)
    for (int i = 1; i < prices.length; i++) {
      sum = Math.max(0, sum += prices[i] - prices[i - 1]);
      max = Math.max(max, sum);
    }
    return max;
  }
}