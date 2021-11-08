/**
 * Problem
 * https://leetcode.com/problems/isomorphic-strings/
 * 
 * ************************************************************* 
 * 
 * Input: s = "egg", t = "add"
 * 
 * Output: true
 * 
 * ************************************************************* 
 * 
 * Input: s = "foo", t = "bar"
 * 
 * Output: false
 * 
 * ************************************************************* 
 * 
 * Input: s = "paper", t = "title"
 * 
 * Output: true
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Isomorphic {
  public boolean isIsomorphic(String s, String t) {
    /**
     * Space Complexity: O(1)
     *   - O(n), For dynamic input, maybe more than initial space.
     *   - O(1), For this problem, the number of numbers always smaller than 5  *10^4
     *           And depends on relationship between hash table and input values.
     *           Generally O(1)
     *           Collision O(n)
     */
    Map<Character, Character> map = new HashMap<>();
    
    /**
     * Time Complexity: O(n)
     *   - O(n), for loop
     *   - O(1), map.containsKey(K)
     *           map.containsValue(V)
     *           map.put(K,V)
     *           Depends on relationship between hash table and input values.
     *           Generally O(1)
     *           Collision O(n)
     */
    for (int i = 0; i < s.length(); i++) {
      if (map.containsKey(s.charAt(i))) {
        if (map.get(s.charAt(i)) != t.charAt(i)) {
          return false;
        }
      } else {
        if (map.containsValue(t.charAt(i))) {
          return false;
        }
        map.put(s.charAt(i), t.charAt(i));
      }
    }
    return true;
  }
}