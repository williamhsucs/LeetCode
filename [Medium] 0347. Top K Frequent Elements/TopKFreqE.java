import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem
 * https://leetcode.com/problems/top-k-frequent-elements/
 * 
 * ************************************************************* 
 * Time Complexity: O(nlogn)
 * Space Complexity: O(n)
 */
class TopKFreqE {
  public int[] topKFrequent(int[] nums, int k) {
    // Space O(n)
    Map<Integer, Integer> map = new HashMap<>();
    // Space O(n)
    Map<Integer, List<Integer>> tree = new TreeMap<>(Collections.reverseOrder());
    // Space O(n)
    List<Integer> aryList = new ArrayList<>();
    // Space O(k)
    int[] ret = new int[k];
    int count = 0;
    
    // Time O(n)
    for (int i : nums) {
      // Time O(1)
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    
    /**
     * Time O(nlogn)
     */
    // Time O(n)
    for (int key : map.keySet()) {
      int treeKey = map.get(key);
      // Time O(logn)
      aryList = tree.getOrDefault(treeKey, new ArrayList<>());
      // Time O(1)
      aryList.add(key);
      // Time O(logn)
      tree.put(treeKey, aryList);
    }

    // Time O(k), count == k will return
    for (List<Integer> list : tree.values()) {
      for (int i : list) {
        if (count == k) break;
        ret[count++] = i;
      }
    }

    return ret;
  }
}




/**
 * Wonderful Solution
 * Author: mo10
 */

class TopKFreqEmo10 {
  public List<Integer> topKFrequent(int[] nums, int k) {

    List<Integer>[] bucket = new List[nums.length + 1];
    Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

    for (int n : nums) {
      frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
    }

    for (int key : frequencyMap.keySet()) {
      int frequency = frequencyMap.get(key);
      if (bucket[frequency] == null) {
        bucket[frequency] = new ArrayList<>();
      }
      bucket[frequency].add(key);
    }

    List<Integer> res = new ArrayList<>();

    for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
      if (bucket[pos] != null) {
        res.addAll(bucket[pos]);
      }
    }
    return res;
  }
}