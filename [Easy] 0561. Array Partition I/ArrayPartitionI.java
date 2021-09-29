/**
 * Problem
 * https://leetcode.com/problems/array-partition-i/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [1,4,3,2]
 * 
 * Output: 4
 * 
 * ************************************************************* 
 * 
 * Input: nums = [6,2,6,5,1,2]
 * 
 * Output: 9
 * 
 * ************************************************************* 
 * Time Complexity: O(nlogn)
 * Space Complexity: O(1)
 */
class ArrayPartitionI {
  public int arrayPairSum(int[] nums) {
    int sum = 0;
    /**
     * Time Complexity: O(nlogn)
     */
    Arrays.sort(nums);
    /**
     * Time Complexity: O(n)
     */
    for (int i = 0; i < nums.length; i+=2) {
      sum += nums[i];
    }
    return sum;
  }
}