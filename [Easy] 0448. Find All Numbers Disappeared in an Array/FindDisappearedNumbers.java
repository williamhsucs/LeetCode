/**
 * Problem
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [4,3,2,7,8,2,3,1]
 * 
 * Output: [5,6]
 * 
 * ************************************************************* 
 * 
 * Input: nums = [1,1]
 * 
 * Output: [2]
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
import java.util.*;

class FindDisappearedNumbers {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    /**
     * Since every swap we put at least one number to its correct position, the time is O(n)
     */
    for (int i = 0; i <= nums.length - 1; i++) {
      /**
       * nums[i] != i + 1
       * The value of index should be equal to index + 1
       * idx [0, 1, 2, 3, 4]
       * val [1, 2, 3, 4, 5]
       * 
       * nums[i] != nums[nums[i] - 1]
       * There is no need to exchange
       * If the value of the position that we want to exchange is already same value.
       *
       */
      while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
        int tmp = nums[i];
        nums[i] = nums[tmp - 1];
        nums[tmp - 1] = tmp;
      }
    }
    /**
     * According to problem said.
     * Assume the returned list does not count as extra space.
     */
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] != i + 1) {
        list.add(i + 1);
      }
    }
    return list;
  }
}