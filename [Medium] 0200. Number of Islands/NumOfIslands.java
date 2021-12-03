/**
 * Problem
 * https://leetcode.com/problems/number-of-islands/
 * 
 * *************************************************************  
 * Time O(mn)
 * Space O(mn)
 */
class NumOfIslands {

  private boolean check(char[][] grid, int x, int y, int xLimit, int yLimit) {
    if (grid[x][y] == '1') {
      grid[x][y] = '0';
      // Check right
      if (y + 1 < yLimit) check(grid, x, y + 1, xLimit, yLimit);
      // Check bottom
      if (x + 1 < xLimit)check(grid, x + 1, y, xLimit, yLimit);
      // Check top
      if (x - 1 >= 0) check(grid, x - 1, y, xLimit, yLimit);
      // Check left
      if (y - 1 >= 0) check(grid, x, y - 1, xLimit, yLimit);
      return true;
    }
    return false;
  }

  public int numIslands(char[][] grid) {
    int sum = 0;

    // Time (m*n)
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        // Space (h), 
        if (check(grid, i, j, grid.length, grid[i].length)) {
          sum++;
        }
      }
    }

    return sum;
  }
}