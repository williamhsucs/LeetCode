/**
 * Problem
 * https://leetcode.com/problems/jewels-and-stones/
 * 
 * ************************************************************* 
 * 
 * Input: jewels = "aA", stones = "aAAbbbb"
 * 
 * Output: 3
 * 
 * ************************************************************* 
 * 
 * Input: jewels = "z", stones = "ZZ"
 * 
 * Output: 0
 * 
 * *************************************************************
 * Time Complexity: O(n)
 * Space Complexity: O(n) 
 */
class JewelsStones {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int numJewelsInStones(String jewels, String stones) {
    // Space O(n)
    Set<Character> set = new HashSet<>();
    int sum = 0;
    
    // Time O(m)
    for (int i = 0; i < jewels.length(); i++) {
      set.add(jewels.charAt(i));
    }
    
    // Time O(n)
    for (int i = 0; i < stones.length(); i++) {
      if (set.contains(stones.charAt(i))) sum++;
    }
    
    return sum;
  }
}