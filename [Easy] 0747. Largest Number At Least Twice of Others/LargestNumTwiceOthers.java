/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class LargestNumTwiceOthers {
  public int dominantIndex(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }
    
    int maxIdx = -1;
    int minorIdx = -1;

    /**
     * Time Complexity: O(n)
     */
    for (int i = 0; i < nums.length; i++) {
      if (maxIdx == -1) {
        maxIdx = i;
      } else if (nums[i] >= nums[maxIdx]) {
        /**
         * Largest integer is unique.
         * So, if nums[i] == nums[maxIdx]. It means this value is not max value.
         * Don't worry about value equal case.
         */
        minorIdx = maxIdx;
        maxIdx = i;
      } else if (minorIdx == -1) {
        minorIdx = i;
      } else if (nums[i] > nums[minorIdx]) {
        minorIdx = i;
      }
    }
    
    if (nums[maxIdx] >= 2 * nums[minorIdx]) {
      return maxIdx;
    } else {
      return -1;
    }
  }
}