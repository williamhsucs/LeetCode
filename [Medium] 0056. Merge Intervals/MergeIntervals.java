class MergeIntervals {
  /**
   * Time O(n)
   * Space O(n)
   */
  public int[][] merge(int[][] intervals) {
    int[] start = new int[10000];
    int[] end = new int[10000];
    List<int[]> retList = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();
    int max = 0;
    
    // Time O(n)
    for (int i = 0; i < intervals.length; i++) {
      start[intervals[i][0]]++;
      end[intervals[i][1]]++;
      max = Math.max(max, intervals[i][1]);
    }

    // Time O(n)
    int[] range = new int[2];
    for (int i = 0; i <= max; i++) {
      if (start[i] > 0) {
        if (stack.isEmpty()) {
          range = new int[2];
          range[0] = i;
          retList.add(range);
        }
        for (int j = 0; j < start[i]; j++) stack.push(i);
      }
      
      if (end[i] > 0) {
        for (int j = 0; j < end[i]; j++) stack.pop();
        if (stack.isEmpty()) {
          range[1] = i;
          retList.set(retList.size() - 1, range);
        }
      }
    }

    // Time O(n)
    return retList.toArray(new int[retList.size()][]);
  }
}