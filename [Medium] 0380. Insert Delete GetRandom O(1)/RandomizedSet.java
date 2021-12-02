import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem
 * https://leetcode.com/problems/insert-delete-getrandom-o1/
 * 
 * ************************************************************* 
 * Time Complexity: O()
 * Space Complexity: O()
 */
class RandomizedSet {

  Map<Integer, Integer> map;
  List<Integer> list;

  public RandomizedSet() {
    map = new HashMap<>();
    list = new ArrayList<>();
  }
  
  public boolean insert(int val) {
    // Time O(1)
    if (map.containsKey(val)) {
      return false;
    } else {
      // Time O(1)
      map.put(val, list.size());
      list.add(val);
      return true;
    }
  }
  
  public boolean remove(int val) {
    // Time O(1)
    if (map.containsKey(val)) {
      /**
       * 1. Switch the target with last index. Than remove it.
       * 2. If the target already the last one. Remove it directly.
       */
      // Time O(1))
      int idx = map.remove(val);
      if (idx != list.size() - 1) {
        int temp = list.get(list.size() - 1);
        // Time O(1)
        list.set(idx, temp);
        // Time O(1)
        map.put(temp, idx);
      }
      // Time O(1)
      list.remove(list.size() - 1);
      return true;
    } else {
      return false;
    }
  }
  
  public int getRandom() {
    // Time O(1)
    int i = getRandomNumber(0, list.size());
    // Time O(1)
    return list.get(i);
  }
  
  private int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }
}