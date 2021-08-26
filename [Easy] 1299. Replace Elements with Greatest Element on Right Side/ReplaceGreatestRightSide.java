/**
 * Problem
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * 
 * ************************************************************* 
 * 
 * Input: arr = [17,18,5,4,6,1]
 * 
 * Output: [18,6,6,6,1,-1]
 * 
 * Explanation:
 * - index 0 --> the greatest element to the right of index 0 is index 1 (18).
 * - index 1 --> the greatest element to the right of index 1 is index 4 (6).
 * - index 2 --> the greatest element to the right of index 2 is index 4 (6).
 * - index 3 --> the greatest element to the right of index 3 is index 4 (6).
 * - index 4 --> the greatest element to the right of index 4 is index 5 (1).
 * - index 5 --> there are no elements to the right of index 5, so we put -1.
 * 
 * ************************************************************* 
 * 
 * Input: arr = [400]
 * 
 * Output: [-1]
 * 
 * Explanation:
 * There are no elements to the right of index 0.
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class ReplaceGreatestRightSide {
  public int[] replaceElements(int[] arr) {
    int max = -1;
    int cur = 0;
    // Run O(n)
    for (int i = arr.length - 1; i >= 0; i--) {
      cur = arr[i];
      arr[i] = max;
      max = Math.max(cur, max);
    }
    return arr;
  }
}
