/**
 * Problem
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * 
 * ************************************************************* 
 * 
 * Input: s = "leetcode"
 * 
 * Output: 0
 * 
 * ************************************************************* 
 * 
 * Input: s = "loveleetcode"
 * 
 * Output: 2
 * 
 * ************************************************************* 
 * 
 * Input: s = "aabb"
 * 
 * Output: -1
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class FirstUniCharInString {
  public int firstUniqChar(String s) {
    // Space Complexity: O(n)
    Map<Character, Integer> map = new HashMap<>();
    
    // Time Complexity: O(n)
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      // Time Complexity: O(1)
      if (map.containsKey(c)) {
        map.replace(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }
    
    // Time Complexity: O(n)
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.get(c) == 1) {
        return i;
      }
    }
    return -1;
  }
}