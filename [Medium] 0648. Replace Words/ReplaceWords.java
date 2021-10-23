class ReplaceWords {
  class Trie {
    class TrieNode {
      boolean isWord;
      TrieNode[] kids;
      
      public TrieNode() {
        isWord = false;
        kids = new TrieNode[26];
      }
    }
    
    private TrieNode root;
    
    public Trie() {
      root = new TrieNode();
    }
    
    /**
     * Time Complexity: O(k)
     * Space Complexity: O(k)
     */
    public void insert(String key) {
      TrieNode node = root;
      /**
       * Time Complexity: O(k), where k represents string key length.
       * Space Complexity: O(k)
       *   - new TrieNode: O(k), each letter is a node.
       */
      for (int i = 0; i < key.length(); i++) {
        int idx = key.charAt(i) - 'a';
        if (node.kids[idx] == null) {
          node.kids[idx] = new TrieNode();
        }
        node = node.kids[idx];
      }
      node.isWord = true;
    }
    
    /**
     * Time Complexity: O(p)
     * Space Complexity: O(1)
     */
    public String prefix(String prefix) {
      TrieNode node = root;
      String s = "";
      /**
       * Time Complexity: O(p), where p represents shortest key length matched in dictionary.
       * Space Complexity: O(1)
       */
      for (int i = 0; i < prefix.length(); i++) {
        char c = prefix.charAt(i);
        int idx = c - 'a';
        if (node.isWord || node.kids[idx] == null) break;
        s += c;
        node = node.kids[idx];
      }
      if (node.isWord) {
        return s;
      } else {
        return prefix;
      }
    }
  }
  
  /**
   * Time Complexity: O(d*k + w*p)
   * Space Complexity: O(d*k + s)
   */
  public String replaceWords(List<String> dictionary, String sentence) {
    Trie trie = new Trie();
    /**
     * Space Complexity: O(s), where s represents words in sentence.
     */
    String[] ary = sentence.split(" ");
    /**
    * Space Complexity: O(s), depends on replace sentence length.
    */
    String ret = "";
    /**
     * Create dictionary.
     *
     * Time Complexity: O(d*k)
     * Space Complexity: O(d*k)
     *   - for loop: O(d), where d represents the number of elements in dictionary.
     *   - Trie insert: O(k), where k represents longest string length in dictionary.
     */
    for (int i = 0; i < dictionary.size(); i++) {
      /**
       * Time Complexity: O(k)
       * Space Complexity: O(k)
       */
      trie.insert(dictionary.get(i));
    }
    /**
     * Replace words.
     *
     * Time Complexity: O(w*p)
     *   - for loop: O(w), where w represents words in sentence.
     *   - Trie prefix: O(p), where p represents key length matched in dictionary.
     */
    for (int i = 0; i < ary.length; i++) {
      /**
       * Time Complexity: O(p)
       * Space Complexity: O(1)
       */
      ret += trie.prefix(ary[i]);
      if (i < ary.length - 1) ret += " ";
    }
    return ret;
  }
}