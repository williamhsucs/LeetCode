/**
 * Problem
 * https://leetcode.com/problems/sort-array-by-parity/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [3,1,2,4]
 * 
 * Output: [2,4,3,1]
 * 
 * Explanation:
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class SortArrayByParity {
  public int[] sortArrayByParity(int[] nums) {
    int oddIdx = 0;
    int buf = 0;
    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] % 2 == 0) {
        buf = nums[oddIdx];
        nums[oddIdx++] = nums[i];
        nums[i] = buf;
      }
    }
    return nums;
  }
}
