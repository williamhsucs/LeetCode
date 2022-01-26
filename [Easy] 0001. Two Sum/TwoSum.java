/**

    The conditions are:

    - It would have exactly one solution.
    - Shouldn’t use the same element twice.
    - Array contains negative numbers.
    - The integer array is not sorted.
    - The given array will not be empty and must have at least two elements.
    - Target can be negative.

    Example 1: nums = [3, 2, 1, -5, 4], target = 6
    Example 2: nums = [-1, 1], target = 0

    Binary search has O(log n) time complexity and doesn’t use any extra memory. However, the given array is not sorted. It costs O(n log n) time complexity to sort the array first. So using binary search to solve this problem, the complexity would be:
    Time O(n log n)
    Space O(1)

    HashMap has O(1) get, put time complexity but needs O(n) space complexity. In order to put all the array elements into the hash table, it needs to iterate over the entire array. And the time complexity will rise to O(n). So using HashMap to solve this problem, the complexity would be:
    Time O(n)
    Space O(n)

    In conclusion, I would use binary search if memory is limited. In most cases, I prefer to use hashmap for more efficient time.

 */

class TwoSum {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int[] twoSum(int[] nums, int target) {
    // Space O(n)
    Map<Integer, Integer> map = new HashMap<>();
    /**
     * Time O(n)
     *  - for loop: O(n)
     *  - HashMap APIs: O(1)
     */
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        return new int[]{map.get(nums[i]), i};
      }
      map.put(target - nums[i], i);
    }
    return nums;
  }
}