class CapitalizeTitle {
  // Space O(1)
  String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  String lower = "abcdefghijklmnopqrstuvwxyz";
  
  // Time O(1)
  private char toLower(char c) {
    if (c - 'a' >= 0 && c - 'a' <= 26) return c;
    return lower.charAt(c - 'A');
  }
  
  // Time O(1)
  private char toUpper(char c) {
    if (c - 'A' >= 0 && c - 'A' <= 26) return c;
    return upper.charAt(c - 'a');
  }
  
  /**
   * Time O(m), where m is the total number of characters in the title
   * Space O(n), where n is the number of words in the title
   */
  public String capitalizeTitle(String title) {
    // Space O(n), where n is the number of words in the title
    String[] words = title.split(" ");
    StringBuilder str = new StringBuilder();
    // Time O(m), where m is the total number of characters in the title
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() <= 2) {
        for (int j = 0; j < words[i].length(); j++) {
          str.append(toLower(words[i].charAt(j)));
        }
      } else {
        str.append(toUpper(words[i].charAt(0)));
        for (int j = 1; j < words[i].length(); j++) {
          str.append(toLower(words[i].charAt(j)));
        }
      }
      if (i != words.length - 1) {
        str.append(" ");
      }
    }
    return str.toString();
  }
}