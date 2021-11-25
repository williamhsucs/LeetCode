import java.util.ArrayList;
import java.util.Map;

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
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class IntersectionTwoArraysII {
  /**
   * Time Complexity: O(l)
   * Space Complexity: O(s)
   */
  private int[] compare(int[] longer, int[] shorter) {
    // Space Complexity: O(s)
    Map<Integer, Integer> map = new HashMap<>();
    // Space Complexity: O(s)
    ArrayList<Integer> list = new ArrayList<>();
    int[] ret;
    
    // Time Complexity: O(s)
    for (int i : shorter) {
      /**
       * HashMap Average Time Complexity:
       *   - search O(1)
       *   - insert O(1)
       *   - delete O(1)
       */
      if (map.containsKey(i)) {
        map.replace(i, map.get(i) + 1);
      } else {
        map.put(i, 1);
      }
    }
    
    // Time Complexity: O(l)
    for (int i : longer) {
      if (map.containsKey(i)) {
        map.replace(i, map.get(i) - 1);
        if (map.get(i) == 0) {
          map.remove(i);
        }
        // Time Complexity: O(1)
        list.add(i);
      }
    }

    // Space Complexity: O(s)
    ret = new int[list.size()];
    // Time Complexity: O(s)
    for (int i = 0; i < list.size(); i++) {
      // Time Complexity: O(1)
      ret[i] = list.get(i);
    }

    return ret;
  }

  public int[] intersect(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) {
      return compare(nums1, nums2);
    } else {
      return compare(nums2, nums1);
    }
  }
}