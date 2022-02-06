class NonOverlapInterval {
  /**
   * Time O(nlogn)
   * Space O(1)
   */
  public int eraseOverlapIntervals(int[][] intervals) {
    if (intervals.length == 0 || intervals.length == 1) return 0;
    int comp = 0;
    int count = 0;
    // Time O(nlogn)
    Arrays.sort(intervals, new compare());
    
    // Time O(n)
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] < intervals[comp][1]) {
        count++;
        if (intervals[i][1] < intervals[comp][1]) comp = i;
      } else {
        comp = i;
      }
    }
    return count;
  }
  
  class compare implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
      return a[1] - b[1];
    }
  }
}