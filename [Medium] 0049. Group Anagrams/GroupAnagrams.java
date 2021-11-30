/**
 * Problem
 * https://leetcode.com/problems/group-anagrams/
 * 
 * ************************************************************* 
 * 
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * 
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 
 * ************************************************************* 
 * 
 * Input: strs = [""]
 * 
 * Output: [[""]]
 * 
 * ************************************************************* 
 * 
 * Input: strs = ["a"]
 * 
 * Output: [["a"]]
 * 
 * ************************************************************* 
 * 
 * Time Complexity: O(m * n)
 * Space Complexity: O(n)
 */
class GroupAnagrams {
  /**
   * Time O(m * n)
   * Space O(n)
   */
  public List<List<String>> groupAnagrams(String[] strs) {
    // Space O(n)
    Map<String, List<String>> map = new HashMap<>();
    // Time O(n)
    for (String s : strs) {
      // Space O(1)
      char[] ary = new char[26];
      // Time O(m)
      for (char c : s.toCharArray()) {
        ary[c - 'a']++;
      }
      // Space O(1);
      String key = String.valueOf(ary);
      // Time O(1)
      if (!map.containsKey(key)) {
        // Time O(1)
        map.put(key, new ArrayList<>());
      }
      // Time O(1)
      map.get(key).add(s);
    }
    // Time, Space O(n)
    return new ArrayList<>(map.values());
  }
}