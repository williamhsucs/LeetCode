/**
 * Problem
 * https://leetcode.com/problems/valid-mountain-array/
 * 
 * Input: arr = [2,1]
 * 
 * Output: false
 * 
 * ************************************************************* 
 * 
 * Input: arr = [3,5,5]
 * 
 * Output: false
 * 
 * ************************************************************* 
 * 
 * Input: arr = [0,3,2,1]
 * 
 * Output: true
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class ValidMountainArray {
  public boolean validMountainArray(int[] arr) {
    if ((arr.length < 3) || (arr[0] > arr[1])) {
      return false;
    }
    boolean increase = true;
    
    // Run O(n)
    for (int i = 1; i <= arr.length - 1; i++) {
      if (arr[i] == arr[i - 1]) {
        return false;
      } else if (increase) {
        if (arr[i] < arr[i - 1]) {
          increase = false;
          if (i == arr.length - 1) {
            return true;
          }
        }
        if (i == arr.length - 1) {
          return false;
        }
      } else {
        if (arr[i] > arr[i - 1]) {
          return false;
        }
        if (i == arr.length - 1) {
          return true;
        }
      }
    }
    return true;
  }
}