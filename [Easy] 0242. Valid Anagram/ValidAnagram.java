class ValidAnagram {
  /**
   * Time O(n)
   * Space O(n)
   */
  public boolean isAnagram(String s, String t) {
    if (s == null && t == null) return true;
    if (s == null || t == null) return false;
    if (s.length() != t.length()) return false;
    
    // Space O(n)
    Map<Character, Integer> map = new HashMap<>();
    
    // Time O(n)
    for (int i = 0; i < s.length(); i++) {
      char sc = s.charAt(i);
      char tc = t.charAt(i);
      map.put(sc, map.getOrDefault(sc, 0) + 1);
      map.put(tc, map.getOrDefault(tc, 0) - 1);
    }
    
    // Time O(n)
    for (Integer i : map.values()) {
      if (i != 0) return false;
    }
    return true;
  }
}