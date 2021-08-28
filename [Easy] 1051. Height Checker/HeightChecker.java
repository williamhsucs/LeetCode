/**
 * Problem
 * https://leetcode.com/problems/move-zeroes/
 * 
 * ************************************************************* 
 * 
 * Input: heights = [1,1,4,2,1,3]
 * 
 * Output: 3
 * 
 * Explanation:
 * heights:  [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4]
 * Indices 2, 4, and 5 do not match.
 * 
 * ************************************************************* 
 * 
 * Input: heights = [5,1,2,3,4]
 * 
 * Output: 5
 * 
 * Explanation:
 * heights:  [5,1,2,3,4]
 * expected: [1,2,3,4,5]
 * All indices do not match.
 * 
 * ************************************************************* 
 * 
 * Input: heights = [1,2,3,4,5]
 * 
 * Output: 0
 * 
 * Explanation:
 * heights:  [1,2,3,4,5]
 * expected: [1,2,3,4,5]
 * All indices match.
 * 
 * ************************************************************* 
 * Time Complexity: O(nlogn)
 *   - Because of Arrays.sort 
 * Space Complexity: O(n)
 */
import java.util.*;

class HeightChecker {
  public int heightChecker(int[] heights) {
    int count = 0;
    // Create new array. Space Complexity -> O(n)
    int[] ary = heights.clone();
    Arrays.sort(ary);
    for (int i = 0; i <= ary.length - 1; i++) {
      if (heights[i] != ary[i]) count++;
    }
    return count;
  }
}
