/**
 * Problem
 * https://leetcode.com/problems/design-hashmap/
 * 
 * ************************************************************* 
 * 
 * Input:
 * ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
 * [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
 * 
 * Output:
 * [null, null, null, 1, -1, null, 1, null, -1]
 * 
 * Explanation
 * MyHashMap myHashMap = new MyHashMap();
 * myHashMap.put(1, 1); // The map is now [[1,1]]
 * myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
 * myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
 * myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
 * myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
 * myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
 * myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
 * myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
 * 
 * ************************************************************* 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class MyHashMap {
  Integer[] table;

  /** Initialize your data structure here. */
  public MyHashMap() {
    /**
     * Space Complexity: O(1), because the size of integer array is fixed.
     */
    table = new Integer[1000001];
  }

  /** value will always be non-negative. */
  public void put(int key, int value) {
    /**
     * Time Complexity: O(1)
     */
    table[key] = value;
  }

  /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
  public int get(int key) {
    /**
     * Time Complexity: O(1)
     */
    return table[key] != null ? table[key] : -1;
  }

  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  public void remove(int key) {
    /**
     * Time Complexity: O(1)
     */
    table[key] = null;
  }
}