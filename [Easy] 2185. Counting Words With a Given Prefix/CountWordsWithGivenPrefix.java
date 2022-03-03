class CountWordsWithGivenPrefix {
  public int prefixCount(String[] words, String pref) {
    int count = 0;
    /**
     * Time O(nm), where
     *  - n is the length of words array
     *  - m is the length of prefix
     */
    for (String word : words) {
      if (word.indexOf(pref) == 0) count++;
    }
    return count;
  }
}

class CountWordsWithGivenPrefixUsingTrie {
  class TrieNode {
    boolean isEnd = false;
    TrieNode[] children = new TrieNode[26];
  }
  
  TrieNode root = new TrieNode();
  
  // Time O(n), where n is the length of word
  public void insert(String word) {
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      if (node.children[idx] == null) node.children[idx] = new TrieNode();
      node = node.children[idx];
    }
    node.isEnd = true;
  }
  
  // Time O(n), where n is the length of prefix
  public boolean isPref(String word) {
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      if (node.children[idx] == null) return false;
      node = node.children[idx];
      if (node.isEnd) return true;
    }
    return false;
  }
  
  public int prefixCount(String[] words, String pref) {
    int count = 0;
    insert(pref);
    /**
     * Time O(nm), where
     *  - n is the length of words array
     *  - m is the length of prefix
     */
    for (String word : words) {
      if (isPref(word)) count++;
    }
    return count;
  }
}