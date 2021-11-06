/**
 * Problem
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * 
 * ************************************************************* 
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * 
 * Output: [2]
 * 
 * ************************************************************* 
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 
 * Output: [9,4]
 * 
 * Explanation: [4,9] is also accepted.
 * 
 * ************************************************************* 
 * Time Complexity: O(m + n)
 * Space Complexity: O(m + n)
 */
class IntersectionTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    /**
     * Space Complexity: O(n)
     */
    Set<Integer> set1 = new HashSet<>();
    /**
     * Space Complexity: O(m)
     */
    Set<Integer> set2 = new HashSet<>();
    int[] ret;
    int size = 0;
    
    /**
     * Time Complexity: O(n)
     */
    for (int i : nums1) {
      set1.add(i);
    }
    
    /**
     * Time Complexity: O(m)
     */
    for (int i : nums2) {
      if (set1.contains(i)) {
        set2.add(i);
      }
    }
    
    /**
     * Space Complexity: O(m)
     */
    ret = new int[set2.size()];
    
    /**
     * Time Complexity: O(m)
     */
    for (int i : set2) {
      ret[size++] = i;
    }
    
    return ret;
  }
}