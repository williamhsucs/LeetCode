/**
 * Problem
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 * 
 * ************************************************************* 
 * 
 * Input: arr = [10,2,5,3]
 * 
 * Output: true
 * 
 * Explanation:
 * N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * 
 * ************************************************************* 
 * 
 * Input: arr = [7,1,14,11]
 * 
 * Output: true
 * 
 * Explanation:
 * N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 * 
 * ************************************************************* 
 * 
 * Input: arr = [3,1,7,11]
 * 
 * Output: false
 * 
 * Explanation:
 * In this case does not exist N and M, such that N = 2 * M.
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class CheckIfNandItsDoubleExist {
  public boolean checkIfExist(int[] arr) {
    // Space O(n)
    Set<Integer> hashTable = new HashSet<>();
    // Run O(n)
    for (int val : arr) {
      if (hashTable.contains(val * 2) || (val % 2 == 0 && hashTable.contains(val / 2))) {
        return true;
      } else {
        hashTable.add(val);
      }
    }
    return false;
  }
}
