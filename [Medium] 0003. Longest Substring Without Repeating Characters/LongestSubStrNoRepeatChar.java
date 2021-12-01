import java.util.Map;

/**
 * Problem
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 * ************************************************************* 
 * 
 * Input: s = "abcabcbb"
 * 
 * Output: 3
 * 
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * ************************************************************* 
 * 
 * Input: s = "bbbbb"
 * 
 * Output: 1
 * 
 * Explanation: The answer is "b", with the length of 1.
 * 
 * ************************************************************* 
 * 
 * Input: s = "pwwkew"
 * 
 * Output: 3
 * 
 * Explanation: The answer is "wke", with the length of 3.
 * 
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * ************************************************************* 
 * 
 * Input: s = ""
 * 
 * Output: 0
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class LongestSubStrNoRepeatChar {
  public int lengthOfLongestSubstring(String s) {
    // Space O(n)
    Map<Character, Integer> map = new HashMap<>();
    int max = 0;
    int pointer = 0;

    // Time O(n)
    for (int i = 0; i < s.length(); i++) {
      // Time O(1)
      char c = s.charAt(i);
      // Time O(1)
      if (map.containsKey(c))  {
        // Time O(1)
        pointer = Math.max(pointer, map.get(c) + 1);
      }
      // Time O(1)
      map.put(c, i);
      max = Math.max(max, (i - pointer + 1));
    }

    return max;
  }
}