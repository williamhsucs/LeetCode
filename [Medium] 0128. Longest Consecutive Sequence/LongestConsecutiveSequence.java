class LongestConsecutiveSequence {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int longestConsecutive(int[] nums) {
    // Space O(n)
    Set<Integer> set = new HashSet<>();
    int max = 0;
    
    // Time O(n)
    for (int i : nums) set.add(i);
    
    // Time O(n)
    for (int i : nums) {
      if (set.contains(i)) {
        set.remove(i);
        int left = i;
        int right = i;
        while (set.contains(left - 1)) {
          set.remove(left);
          left--;
        }
        while (set.contains(right + 1)) {
          set.remove(right);
          right++;
        }
        max = Math.max(max , right - left + 1);
      }
    }
    
    return max;
  }
}