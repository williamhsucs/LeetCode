/**
 * Problem
 * https://leetcode.com/problems/contains-duplicate/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [1,2,3,1]
 * 
 * Output: true
 * 
 * ************************************************************* 
 * 
 * Input: nums = [1,2,3,4]
 * 
 * Output: false
 * 
 * ************************************************************* 
 * 
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * 
 * Output: true
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    /**
     * Space Complexity: O(n)
     */
    Set<Integer> set = new HashSet<>();
    /**
     * Time Complexity: O(n)
     */
    for (int i : nums) {
      if (set.contains(i)) {
        return true;
      }
      set.add(i);
    }
    return false;
  }
}