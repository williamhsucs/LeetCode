/**
 * Problem
 * https://leetcode.com/problems/reverse-string/
 * 
 * ************************************************************* 
 * 
 * Input: s = ["h","e","l","l","o"]
 * 
 * Output: ["o","l","l","e","h"]
 * 
 * ************************************************************* 
 * 
 * Input: s = ["H","a","n","n","a","h"]
 * 
 * Output: ["h","a","n","n","a","H"]
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class ReverseString {
  public char[] reverseString(char[] s) {
    char temp;
    /**
     *  Time Complexity: O(n)
     */
    for (int i = 0, j = s.length - 1; i <= j; i++, j--) {
      temp = s[i];
      s[i] = s[j];
      s[j] = temp;
    }

    return s;
  }
}