/**
 * Problem
 * https://leetcode.com/problems/single-number/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [2,2,1]
 * 
 * Output: 1
 * 
 * ************************************************************* 
 * 
 * Input: nums = [4,1,2,1,2]
 * 
 * Output: 4
 * 
 * *************************************************************
 * 
 * Input: nums = [1]
 * 
 * Output: 1 
 * 
 * *************************************************************
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class SingleNumber {
  public int singleNumber(int[] nums) {
    /**
     * Space Comlexity: O(n)
     */
    Set<Integer> set = new HashSet<>();
    
    /**
     * Time Complexity: O(n)
     */
    for (int i : nums) {
      if (set.contains(i)) {
        set.remove(i);
      } else {
        set.add(i);
      }
    }
    
    /**
     * Time Complexity: O(1)
     * Cause according to the problem desc, only left one num.
     */
    for (int i : set) {
      return i;
    }
    
    return 0;
  }
}