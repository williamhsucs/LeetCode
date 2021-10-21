/**
 * Problem
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 * 
 * ************************************************************* 
 * 
 * Input:
 * ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
 * [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
 * 
 * Output:
 * [null, null, true, false, true, null, true]
 * 
 * Explaination:
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");   // return True
 * trie.search("app");     // return False
 * trie.startsWith("app"); // return True
 * trie.insert("app");
 * trie.search("app");     // return True
 * 
 * ************************************************************* 
 */
class Trie {
  
  class TrieNode {
    public boolean isWord;
    public TrieNode[] children = new TrieNode[26];
  }

  private TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

  /**
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public void insert(String word) {
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (node.children[c - 'a'] == null) {
        node.children[c - 'a'] = new TrieNode();
      }
      node = node.children[c - 'a'];
    }
    node.isWord = true;
  }
  
  /**
   * Time Complexity: O(n)
   */
  public boolean search(String word) {
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      if (node.children[idx] == null) return false;
      node = node.children[idx];
    }
    return node.isWord;
  }
  
  /**
   * Time Complexity: O(n)
   */
  public boolean startsWith(String prefix) {
    TrieNode node = root;
    for (int i = 0; i < prefix.length(); i++) {
      int idx = prefix.charAt(i) - 'a';
      if (node.children[idx] == null) return false;
      node = node.children[idx];
    }
    return true;
  }
}

/**
* Your Trie object will be instantiated and called as such:
* Trie obj = new Trie();
* obj.insert(word);
* boolean param_2 = obj.search(word);
* boolean param_3 = obj.startsWith(prefix);
*/