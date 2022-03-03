class FindTargetIndicesAfterSortAry {
  /**
   * Time O(n)
   * Space O(n)
   */
  public List<Integer> targetIndices(int[] nums, int target) {
    // Space O(n)
    List<Integer> list = new ArrayList<>();
    int smallerCount = 0;
    int targetCount = 0;
    // Time O(n)
    for (int num : nums) {
      if (num < target) {
        smallerCount++;
      } else if (num == target) {
        targetCount++;
      }
    }
    // Time O(n)
    for (int i = 0; i < targetCount; i++) {
      list.add(smallerCount++);
    }
    return list;
  }
}