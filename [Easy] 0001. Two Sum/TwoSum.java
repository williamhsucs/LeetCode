/**
 * Problem
 * https://leetcode.com/problems/two-sum/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [2,7,11,15], target = 9
 * 
 * Output: [0,1]
 * 
 * Explanation:
 * Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * ************************************************************* 
 * 
 * Input: nums = [3,2,4], target = 6
 * 
 * Output: [1,2]
 * 
 * ************************************************************* 
 * 
 * Input: nums = [3,3], target = 6
 * 
 * Output: [0,1]
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    /**
     * Space Complexity: O(1)
     *   - O(n), For dynamic input, maybe more than initial space.
     *   - O(1), For this problem, the number of numbers always smaller than 10^4
     *           And depends on relationship between hash table and input values.
     *           Generally O(1)
     *           Collision O(n)
     */
    Map<Integer, Integer> map = new HashMap<>();
    int[] ret;
    /**
     * Time complexity: O(n)
     *   - O(n), for loop
     *   - O(1), map.containsKey(K,V)
     * Space complexity: O(1), always declare 2 space for primitive array
     */
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        ret = new int[2];
        ret[0] = i;
        ret[1] = map.get(target - nums[i]);
        return ret;
      } else {
        map.put(nums[i], i);
      }
    }
    return null;
  }
}