class ArithmeticSlices {
  /**
   * Time O(n)
   * Space O(1)
   */
  public int numberOfArithmeticSlices(int[] nums) {
    int sum = 0, subTotal = 0;
    // Time O(n)
    for (int i = 2; i < nums.length; i++) {
      sum += (nums[i] - nums[i - 1]) == (nums[i - 1] - nums[i - 2]) ? ++subTotal : (subTotal = 0);
    }
    return sum;
  }
}