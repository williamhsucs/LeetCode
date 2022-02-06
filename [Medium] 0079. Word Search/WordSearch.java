class WordSearch {
  
  public boolean exist(char[][] board, String word) {
    /**
     * Time O(m*n*4^h)
     * Space O(h)
     */
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (dfs(board, word, i, j, 0)) return true;
      }
    }
    return false;
  }
  
  /**
   * Time O(4^h)
   *  - h means the length of the word.
   *  - Search in four directions.
   *      If the target is always found, the search will take 4^String lengths of time.
   *      If the target is not found, returns false and ends the search.
   *
   * Space O(h) 
   *  - h means the length of the word.
   */
  private boolean dfs(char[][] board, String word, int i, int j, int cur) {
    if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(cur) != board[i][j]) return false;
    if (cur == word.length() - 1) return true;
    char c = board[i][j];
    board[i][j] = '0';
    boolean found = dfs(board, word, i + 1, j, cur + 1) ||
                    dfs(board, word, i - 1, j, cur + 1) ||
                    dfs(board, word, i, j + 1, cur + 1) ||
                    dfs(board, word, i, j - 1, cur + 1);
    board[i][j] = c;
    return found;
  }
}