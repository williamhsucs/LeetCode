/**
 * Problem
 * https://leetcode.com/problems/plus-one/
 * 
 * ************************************************************* 
 * 
 * Input: digits = [1,2,3]
 * 
 * Output: [1,2,4]
 * 
 * Explanation:
 * The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 * ************************************************************* 
 * 
 * Input: digits = [4,3,2,1]
 * 
 * Output: [4,3,2,2]
 * 
 * Explanation:
 * The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * 
 * ************************************************************* 
 * 
 * Input: digits = [0]
 * 
 * Output: [1]
 * 
 * Explanation:
 * The array represents the integer 0.
 * Incrementing by one gives 0 + 1 = 1.
 * Thus, the result should be [1].
 * 
 * ************************************************************* 
 * 
 * Input: digits = [9]
 * 
 * Output: [1,0]
 * 
 * Explanation:
 * The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 *   - for loop
 * Space Complexity: O(n)
 *   - If it has the carry number at the greatest digit.
 *     It means that must to declare an extra space(new array) to store new greatest digit.
 */
class PlusOne {
  public int[] plusOne(int[] digits) {
    /**
     * Time Complexity: O(n)
     */
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] != 9) {
        digits[i]++;
        break;
      } else {
        digits[i] = 0;
      }
    }
    
    if (digits[0] == 0) {
      int[] ret = new int[digits.length + 1];
      ret[0] = 1;
      /**
       * Time Complexity: O(n)
       * Space Complexity: O(1)
       */
      for (int i = 1; i <= ret.length - 1; i++) {
        ret[i] = digits[i - 1];
      }
      
      return ret;
    } else {
      /**
       * Time Complexity: O(n)
       * Space Complexity: O(1)
       */
      return digits;
    }
  }
}


class PlusOneVerOne {
  public int[] plusOne(int[] digits) {
    int carry = 0;
    
    /**
     * Time Complexity: O(n)
     */
    for (int i = digits.length - 1; i >= 0; i--) {
      if (i == digits.length - 1 || carry == 1) {
        digits[i] += 1;
        carry = 0;
      }
      
      if (digits[i] == 10) {
        digits[i] = 0;
        carry = 1;
      }
    }
    
    if (carry == 1) {
      /**
       * Space Complexity: O(n)
       */
      int[] ret = new int[digits.length + 1];
    
      /**
       * Time Complexity: O(n)
       */
      for (int i = ret.length - 1; i >= 1; i--) {
        ret[i] = digits[i - 1];
      }
      ret[0] = 1;
      return ret;
    } else {
      /**
       * Time Complexity: O(n)
       * Space Complexity: O(1)
       */
      return digits;
    }
  }
}