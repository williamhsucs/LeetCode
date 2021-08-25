/**
 * Problem
 * https://leetcode.com/problems/merge-sorted-array/
 * 
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 
 * Output: [1,2,2,3,5,6]
 * 
 * Explanation:
 * The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 *   - for loop from the lenth of nums1 to 0
 * Space Complexity: O(1)
 *   - There is no declaration of any new variables whose memory size depends on the input value.
 *   - The memory used is always the same.
 */
class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    m--; // turn into index;
    n--; // turn into index;
    /**
     * Run from length of array to 0
     * So, Time complexity: O(n)
     */
    for (int i = nums1.length - 1; i >= 0; i--) {
      if ((n < 0) || (m >= 0 && nums1[m] >= nums2[n])) {
        nums1[i] = nums1[m--];
      } else if (n >= 0) {
        nums1[i] = nums2[n--];
      }
    }
  }
}