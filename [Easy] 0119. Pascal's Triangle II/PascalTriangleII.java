class PascalTriangleIIMath {
  /**
   * Time O(n)
   * Space O(n)
   */
  public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>(){
      {
        add(1);
      }
    };
    // Time O(n)
    for (int i = 1; i <= rowIndex; i++) {
      row.add((int) ((long) row.get(i - 1) * (long) (rowIndex - i + 1) / (long) i));
    }
    return row;
  }
}

class PascalTriangleIIDP {
  /**
   * Time O(mn)
   * Space O(rowIndex)
   */
  public List<Integer> getRow(int rowIndex) {
    // Space O(rowIndex)
    List<Integer> dp = new ArrayList<>();
    // Time O(mn)
    for (int i = 0; i <= rowIndex; i++) {
      dp.add(0,1);
      for (int j = 1; j < i; j++) {
        dp.set(j, dp.get(j) + dp.get(j + 1));
      }
    }
    return dp;
  }
}