class TopKFreqE {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int[] topKFrequent(int[] nums, int k) {
    // Space O(n)
    Map<Integer, Integer> count = new HashMap<>();
    Map<Integer, List<Integer>> bucket = new HashMap<>();
    int max = 0;
    // Time O(n)
    for (int i : nums) {
      count.put(i, count.getOrDefault(i, 0) + 1);
      max = Math.max(max, count.get(i));
    }
    // Time O(n)
    for (int key : count.keySet()) {
      List<Integer> list = new ArrayList<>();
      if (bucket.containsKey(count.get(key))) {
        list = bucket.get(count.get(key));
      }
      list.add(key);
      bucket.put(count.get(key), list);
    }
    int[] res = new int[k];
    int resCount = 0;
    // Time O(k)
    for (int i = max; i > 0; i--) {
      List<Integer> list = bucket.get(i);
      if (list != null) {
        for (int j = 0; j < list.size(); j++) {
          res[resCount++] = list.get(j);
          k--;
          if (k == 0) return res;
        }
      }
    }
    return null;
  }
}