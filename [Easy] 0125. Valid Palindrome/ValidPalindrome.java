class ValidPalindrome {
  
  /**
   * Time O(n)
   * Space O(1)
   */
  public boolean isPalindrome(String s) {
    // Space O(1)
    int left = 0;
    int right = s.length() - 1;
    
    // Time O(n)
    while (left < right) {
      // Time O(1)
      Character leftC = Character.toLowerCase(s.charAt(left));
      Character rightC = Character.toLowerCase(s.charAt(right));
      if (!Character.isLetterOrDigit(leftC)) {
        left++;
        continue;
      }
      if (!Character.isLetterOrDigit(rightC)) {
        right--;
        continue;
      }
      if (leftC == rightC) {
        left++;
        right--;
      } else {
        return false;
      }
    }
    
    return true;
  }
}