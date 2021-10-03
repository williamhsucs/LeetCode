/**
 * Problem
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 * 
 * ************************************************************* 
 * 
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * 
 * Output: 2
 * 
 * ************************************************************* 
 * 
 * Input: target = 4, nums = [1,4,4]
 * 
 * Output: 1
 * 
 * ************************************************************* 
 * 
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * 
 * Output: 0
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class MinSizeSubArySum {
  public int minSubArrayLen(int target, int[] nums) {
    int min = Integer.MAX_VALUE;
    int sum = 0;
    /**
     * Time Complexity: O(n)
     *   Worst case is that the range of rear is from 0 to n and so does front.
     *   So, worst case for this nest for while loop is 2n times.
     *   Time complxity is O(2n) -> O(n)
     */
    for (int rear = 0, front = 0; rear < nums.length; rear++) {
      sum += nums[rear];
      while (sum >= target) {
        min = Math.min(min, rear - front + 1);
        sum -= nums[front++];
      }
    }
    return min == Integer.MAX_VALUE ? 0 : min;
  }
}