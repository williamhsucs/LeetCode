class DivideStringIntoGroupsSizeK {
  /**
   * Time O(s)
   * Space O(k)
   */
  public String[] divideString(String s, int k, char fill) {
    int count = k;
    int idx = 0;
    // Space O(k)
    String[] res = new String[(int) Math.ceil(s.length() / (double) k)];
    StringBuilder str = new StringBuilder();
    // Time O(s), where s is the length of string s.
    for (int i = 0; i < s.length(); i++) {
      str.append(s.charAt(i));
      count--;
      if (count == 0) {
        if (i != s.length() - 1) {
          count = k;
        }
        res[idx++] = str.toString();
        str = new StringBuilder();
      }
    }
    if (count > 0) {
      // Time O(k)
      for (int i = count; i > 0; i--) {
        str.append(fill);
      }
      res[idx] = str.toString();
    }
    
    return res;
  }
}