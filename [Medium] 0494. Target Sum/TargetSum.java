class TargetSum {
  /**
   * Time O(2^n)
   *   - Process + and - operations.
   *   - Not a good solution, still can optimize.
   * Space O(n)
   */
  private int dfs(int count, int sum, int[] nums, int target) {
    int ret = 0;
    if (count != nums.length) {
      ret += dfs(count + 1, sum + nums[count], nums, target);
      ret += dfs(count + 1, sum - nums[count], nums, target);
      return ret;
    }

    if (sum == target) {
      return 1;
    } else {
      return 0;
    }
  }

  public int findTargetSumWays(int[] nums, int target) {
    int count = 0;
    int sum = 0;
    return dfs(count, sum, nums, target);
  }
}