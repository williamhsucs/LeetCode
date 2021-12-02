import java.util.Map;

/**
 * Problem
 * https://leetcode.com/problems/4sum-ii/
 * 
 * ************************************************************* 
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
class FourSumII {
  public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    // Space O(n)
    Map<Integer, Integer> map = new HashMap<>();
    int sum = 0;

    /**
     * Time O(n^2)
     */
    // Time O(n)
    for (int i : nums1) {
      // Time O(n)
      for (int j : nums2) {
        int key = -(i + j);
        // Time O(1)
        map.put(key, map.getOrDefault(key, 0) + 1);
      }
    }

    /**
     * Time O(n^2)
     */
    // Time O(n)
    for (int i : nums3) {
      for (int j : nums4) {
        // Time O(1)
        sum += map.getOrDefault(i + j, 0);
      }
    }

    return sum;
  }
}