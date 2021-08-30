/**
 * Problem
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [1,1,2]
 * 
 * Output: 2, nums = [1,2,_]
 * 
 * Explanation:
 * Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * ************************************************************* 
 * 
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * 
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * 
 * Explanation:
 * Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0 || nums.length == 1) {
      // Solve length 0 or 1 array
      return nums.length;
    } 
    int nonDupIdx = 0;
    // Run O(n)
    for (int num : nums) {
      if (nums[nonDupIdx] != num) {
        nums[++nonDupIdx] = num;
      }
    }
    return nonDupIdx + 1;
  }
}