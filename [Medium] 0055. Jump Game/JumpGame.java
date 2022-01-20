class JumpGame {
  /**
   * Time O(n)
   * Space O(1)
   */
  public boolean canJump(int[] nums) {
    if (nums[0] == 0 && nums.length > 1) return false;
    int steps = nums[0];

    // Time O(n)
    for (int i = 1; i < nums.length; i++) {
      steps--;
      if (steps >= 0 && nums[i] > steps) {
        steps = nums[i];
      } else if (steps == 0 && i != nums.length - 1) {
        return false;
      }
    }

    return true;
  }
}