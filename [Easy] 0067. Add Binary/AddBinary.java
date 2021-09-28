/**
 * Problem
 * https://leetcode.com/problems/add-binary/
 * 
 * ************************************************************* 
 * 
 * Input: a = "11", b = "1"
 * 
 * Output: "100"
 * 
 * ************************************************************* 
 * 
 * Input: a = "1010", b = "1011"
 * 
 * Output: "10101"
 * 
 * ************************************************************* 
 * Time Complexcity: O(n)
 * Space Complexcity: O(n)
 */
class AddBinary {
  public String addBinary(String a, String b) {
    int carry = 0;
    int maxLen = 0;
    /**
     * Space Complexcity: O(n)
     */
    StringBuilder s = new StringBuilder();
    
    /**
     * Time Complexcity: O(n)
     */
    if (a.length() > b.length()) {
      maxLen = a.length();
      for (int i = 0; i < maxLen - b.length(); i++) {
        s.append("0");
      }
      b = s.append(b).toString();
    } else {
      maxLen = b.length();
      for (int i = 0; i < maxLen - a.length(); i++) {
        s.append("0");
      }
      a = s.append(a).toString();
    }
    
    s.setLength(0);
    
    /**
     * Time Complexcity: O(n)
     */
    for (int i = maxLen - 1; i >= 0; i--) {
      if (a.charAt(i) == '1' && b.charAt(i) == '1') {
        if (carry == 1) {
          s.insert(0, 1);
        } else {
          carry = 1;
          s.insert(0, 0);
        }
      } else if (a.charAt(i) == '1' || b.charAt(i) == '1') {
        if (carry == 1) {
          carry = 1;
          s.insert(0, 0);
        } else {
          s.insert(0, 1);
        }
      } else {
        if (carry == 1) {
          s.insert(0, 1);
          carry = 0;
        } else {
          s.insert(0, 0);
        }
      }
      
      if (carry == 1 && i == 0) {
        s.insert(0, 1);
      }
    }
    
    return s.toString();
  }
}