/**
 * Problem
 * https://leetcode.com/problems/contains-duplicate-ii/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [1,2,3,1], k = 3
 * 
 * Output: true
 * 
 * ************************************************************* 
 * 
 * Input: nums = [1,0,1,1], k = 1
 * 
 * Output: true
 * 
 * ************************************************************* 
 * 
 * Input: nums = [1,2,3,1,2,3], k = 2
 * 
 * Output: false
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class ContainsDuplicateII {
  /**
   * Time: O(n)
   * Space: O(n)
   */
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    
    // Time: O(n)
    for (int i = 0; i < nums.length; i++) {
      // Time: O(1)
      if (map.containsKey(nums[i])) {
        // Time: O(1)
        if (Math.abs(map.get(nums[i]) - i) <= k) {
          return true;
        } else {
        // Time: O(1)
          map.replace(nums[i], i);
        }
      } else {
        // Time: O(1)
        map.put(nums[i], i);
      }
    }
    return false;
  }
}