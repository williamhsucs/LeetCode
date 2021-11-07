/**
 * Problem
 * https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [3,10,5,25,2,8]
 * 
 * Output: 28
 * 
 * Explanation
 * The maximum result is 5 XOR 25 = 28.
 * 
 * ************************************************************* 
 * 
 * Input: nums = [0]
 * 
 * Output: 0
 * 
 * ************************************************************* 
 * 
 * Input: nums = [2,4]
 * 
 * Output: 6
 * 
 * ************************************************************* 
 * 
 * Input: nums = [8,10,2]
 * 
 * Output: 10
 * 
 * ************************************************************* 
 * 
 * Input: nums = [14,70,53,83,49,91,36,80,92,51,66,70]
 * 
 * Output: 127
 * 
 * ************************************************************* 
 */
class MaxXORTwoNums {
  class TrieNode {
    TrieNode[] children;
    
    public TrieNode() {
      children = new TrieNode[2];
    }
  }
  
  TrieNode root;
  
  public MaxXORTwoNums() {
    root = new TrieNode();
  }
  
  public void addTrieNode(int num) {
    TrieNode node = root;
    /**
     * Time Complexity: O(1)
     *  - always run 30 times
     * Space Complexity: O(1)
     *  - 2 ^ 30
     */
    for (int i = 30; i >= 0; i--) {
      int idx = ((num & (1 << i)) > 0 ? 1 : 0);
      if (node.children[idx] == null) {
        node.children[idx] = new TrieNode();
      }
      node = node.children[idx];
    }
  }
  
  public int findMaximumXOR(int[] nums) {
    // Time Complexity: O(n)
    for (int num : nums) {
      // Time Complexity: O(1)
      addTrieNode(num);
    }
    
    int max = 0;
    
    // Time Complexity: O(n)
    for (int num : nums) {
      TrieNode node = root;
      int sum = 0;
      /**
       * Time Complexity: O(1)
       *  - always run 30 times
       */
      for (int i = 30; i >= 0; i--) {
        int idx = ((num & (1 << i)) > 0 ? 1 : 0);
        /**
         * XOR
         * 0 ^ 0 = 0
         * 0 ^ 1 = 1
         * 1 ^ 0 = 1
         * 1 ^ 1 = 0
         * 
         * Check whether nums XOR 1 exist or not
         */
        if (node.children[idx ^ 1] != null) {
          sum += (1 << i);
          node = node.children[idx ^ 1];
        } else {
          node = node.children[idx];
        }
      }
      max = Math.max(sum, max);
    }
    
    return max;
  }
}