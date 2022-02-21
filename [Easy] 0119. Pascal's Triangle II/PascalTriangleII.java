class Solution {
  /**
   * Time O(mn)
   * Space O(rowIndex)
   */
  public List<Integer> getRow(int rowIndex) {
    // Space O(rowIndex)
    List<Integer> dp = new ArrayList<>();
    // Time O(mn)
    for (int i = 0; i <= rowIndex; i++) {
      dp.add(0,1);
      for (int j = 1; j < i; j++) {
        dp.set(j, dp.get(j) + dp.get(j + 1));
      }
    }
    return dp;
  }
}