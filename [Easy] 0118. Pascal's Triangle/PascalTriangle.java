/**
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 * 
 * Given n rows.
 * Get 1 + 2 + ... + n = n(n+1)/2 elements.
 */
class PascalTriangle {
  public List<List<Integer>> generate(int numRows) {
    /**
     * Space Complexity: O(n^2)
     * Store all elements
     */
    List<List<Integer>> list = new ArrayList<>();
    
    /**
     * Time Complexity: O(n^2)
     * Traverse all elements
     */
    for (int i = 0; i < numRows; i++) {
      for (int j = i; j < numRows; j++) {
        if (i == 0) {
          list.add(new ArrayList());
          list.get(j).add(1);
        } else if (i == j) {
          list.get(j).add(1);
        } else {
          list.get(j).add(list.get(j - 1).get(i) + list.get(j - 1).get(i - 1));
        }
      }
    }
    
    return list;
  }
}