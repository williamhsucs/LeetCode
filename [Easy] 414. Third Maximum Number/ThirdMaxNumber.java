/**
 * Problem
 * https://leetcode.com/problems/third-maximum-number/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [3,2,1]
 * 
 * Output: 1
 * 
 * ************************************************************* 
 * 
 * Input: nums = [1,2]
 * 
 * Output: 2
 * 
 * ************************************************************* 
 * 
 * Input: nums = [2,2,3,1]
 * 
 * Output: 1
 * 
 * ************************************************************* 
 * 
 * Input: nums = [3,-2147483648,1]
 * 
 * Output: -2147483648
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class ThirdMaxNumber {
  public int thirdMax(int[] nums) {
    Integer max1 = null;
    Integer max2 = null;
    Integer max3 = null;
    for (int i : nums) {
      if ((max1 != null && i == max1) || (max2 != null && i == max2) || (max3 != null && i == max3)) continue;
      if (max1 == null || i > max1) {
        max3 = max2;
        max2 = max1;
        max1 = i;
      } else if (max2 == null || i > max2) {
        max3 = max2;
        max2 = i;
      } else if (max3 == null || i > max3) {
        max3 = i;
      } 
    }
    return max3 != null ? max3 : max1;
  }
}
