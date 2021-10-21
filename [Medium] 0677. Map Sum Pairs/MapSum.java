/**
 * Problem
 * https://leetcode.com/problems/map-sum-pairs/
 * 
 * ************************************************************* 
 * 
 * Input:
 * ["MapSum", "insert", "sum", "insert", "sum"]
 * [[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
 * 
 * Output:
 * [null, null, 3, null, 5]
 * 
 * Explaination:
 * MapSum mapSum = new MapSum();
 * mapSum.insert("apple", 3);  
 * mapSum.sum("ap");           // return 3 (apple = 3)
 * mapSum.insert("app", 2);    
 * mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)
 */
class MapSum {
  
  class TrieNode {
    int sum;
    Map<Character, TrieNode> children;
    
    public TrieNode() {
      sum = 0;
      children = new HashMap<>();
    }
  }
  
  private TrieNode root;
  private Map<String, Integer> record;

  public MapSum() {
    root = new TrieNode();
    record = new HashMap<>();
  }

  /**
   * Time Complexity: O(l)
   *   k <= l
   * Space Complexity: O(l*n)
   */
  public void insert(String key, int val) {
    TrieNode node = root;
    /**
     * Replace same key
     * Change the value of the key
     *
     * Time Complexity:
     *   Hash Map: For most case Θ(1), but worst case O(k)
     * Space Complexity:
     *   Hash Map: O(k)
     */
    if (!record.containsKey(key)) {
      record.put(key, val);
    } else {
      int old = record.get(key);
      record.put(key, val);
      val = val - old;
    }
    /**
     * Time Complexity: O(l) or O(l^2)
     *   for loop: O(l), which l represents the number of letters of key.
     *   Hash Map: For most case Θ(1), but worst case O(l)
     * Space Complexity:
     *   Hash Map: O(l*n), each letter has a hash map.
     */
    for (char c : key.toCharArray()) {
      if (node.children.get(c) == null) {
        node.children.put(c, new TrieNode());
      }
      node = node.children.get(c);
      node.sum += val;
    }
  }

  /**
   * Time Complexity: O(p)
   * Space Complexity: O(1)
   */
  public int sum(String prefix) {
    TrieNode node = root;
    /**
     * Time Complexity: O(p) // ( O(p*l) rarely in real life )
     *   for loop: O(p), which p represents the number of letters of prefix.
     *   Hash Map: For most case Θ(1) // ( O(l) rarely in real life)
     */
    for (char c : prefix.toCharArray()) {
      if (node.children.get(c) == null) {
        return 0;
      } else {
        node = node.children.get(c);
      }
    }
    return node.sum;
  }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */