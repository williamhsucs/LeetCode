/**
 * Problem
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * 
 * ************************************************************* 
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * 
 * Output: [2,2]
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
class IntersectionTwoArraysII {
  public int[] intersect(int[] nums1, int[] nums2) {
    // Space Complexity: O(n)
    Map<Integer, Integer> map1 = new HashMap<>();
    // Space Complexity: O(m)
    Map<Integer, Integer> map2 = new HashMap<>();
    // Space Complexity: O(n|m)
    ArrayList<Integer> list = new ArrayList<>();
    
    // Time Complexity: O(n)
    for (int i : nums1) {
      if (map1.containsKey(i)) {
        map1.replace(i, map1.get(i) + 1);
      } else {
        map1.put(i, 1);
      }
    }
    
    // Time Complexity: O(m)
    for (int i : nums2) {
      if (map2.containsKey(i)) {
        map2.replace(i, map2.get(i) + 1);
      } else {
        map2.put(i, 1);
      }
    }
    
    // Time Complexity: O(n)
    for (int i : map1.keySet()) {
      if (map2.containsKey(i)) {
        int times = map1.get(i) < map2.get(i) ? map1.get(i) : map2.get(i);
        while (times-- > 0) list.add(i);
      }
    }
    
    // Space Complexity: O(n|m)
    int[] ret = new int[list.size()];
    
    // Time Complexity: O(n|)
    for (int i = 0; i < list.size(); i++) {
      ret[i] = list.get(i);
    }
    
    return ret;
  }
}