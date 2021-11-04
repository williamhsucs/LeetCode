/**
 * Problem
 * https://leetcode.com/problems/design-hashset/
 * 
 * ************************************************************* 
 * 
 * Input:
 * ["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
 * [[], [1], [2], [1], [3], [2], [2], [2], [2]]
 * 
 * Output:
 * [null, null, null, true, false, null, true, null, false]
 * 
 * Explanation
 * MyHashSet myHashSet = new MyHashSet();
 * myHashSet.add(1);      // set = [1]
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(1); // return True
 * myHashSet.contains(3); // return False, (not found)
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(2); // return True
 * myHashSet.remove(2);   // set = [1]
 * myHashSet.contains(2); // return False, (already removed)
 * 
 * ************************************************************* 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class MyHashSet {
  private boolean[] table;

  public MyHashSet() {
    /**
     * Space Complexity: O(1), because the size of boolean array is fixed.
     */
    table = new boolean[1000001];
  }

  public void add(int key) {
    /**
     * Time Complexity: O(1)
     */
    table[key] = true;
  }

  public void remove(int key) {
    /**
     * Time Complexity: O(1)
     */
    table[key] = false;
  }

  public boolean contains(int key) {
    /**
     * Time Complexity: O(1)
     */
    return table[key];
  }
}