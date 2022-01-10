public class MaxSubArray {
  /**
   * Time O(n)
   * Space O(1)
   */
  public int maxSubArray(int[] nums) {
    int max = nums[0];
    int subTotal = nums[0];
    
    // Time O(n)
    for (int i = 1; i < nums.length; i++) {
      subTotal = Math.max(subTotal + nums[i], nums[i]);
      max = Math.max(subTotal, max);
    }
    
    return max;
  }
}