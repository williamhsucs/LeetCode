/**
 * Problem
 * https://leetcode.com/problems/move-zeroes/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [0,1,0,3,12]
 * 
 * Output: [1,3,12,0,0]
 * 
 * ************************************************************* 
 * 
 * Input: nums = [0]
 * 
 * Output: [0]
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int bufferIdx = 0;
    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] != 0) {
        nums[bufferIdx++] = nums[i];
      }
    }
    for (int i = bufferIdx; i <= nums.length - 1; i++) {
      nums[bufferIdx++] = 0;
    }
  }
}