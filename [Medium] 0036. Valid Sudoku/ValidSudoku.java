/**
 * Problem
 * https://leetcode.com/problems/valid-sudoku/
 * 
 * ************************************************************* 
 * 
 * Input: board = 
 * [["5","3",".",  ".","7",".",  ".",".","."]
 * ,["6",".",".",  "1","9","5",  ".",".","."]
 * ,[".","9","8",  ".",".",".",  ".","6","."]
 * 
 * ,["8",".",".",  ".","6",".",  ".",".","3"]
 * ,["4",".",".",  "8",".","3",  ".",".","1"]
 * ,["7",".",".",  ".","2",".",  ".",".","6"]
 * 
 * ,[".","6",".",  ".",".",".",  "2","8","."]
 * ,[".",".",".",  "4","1","9",  ".",".","5"]
 * ,[".",".",".",  ".","8",".",  ".","7","9"]]
 * 
 * Output: true
 * 
 * ************************************************************* 
 * 
 * Input: board = 
 * [["8","3",".",  ".","7",".",  ".",".","."]
 * ,["6",".",".",  "1","9","5",  ".",".","."]
 * ,[".","9","8",  ".",".",".",  ".","6","."]
 * 
 * ,["8",".",".",  ".","6",".",  ".",".","3"]
 * ,["4",".",".",  "8",".","3",  ".",".","1"]
 * ,["7",".",".",  ".","2",".",  ".",".","6"]
 * 
 * ,[".","6",".",  ".",".",".",  "2","8","."]
 * ,[".",".",".",  "4","1","9",  ".",".","5"]
 * ,[".",".",".",  ".","8",".",  ".","7","9"]]
 * 
 * Output: false
 * 
 * Explanation:
 * Same as Example 1,
 * except with the 5 in the top left corner being modified to 8.
 * Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * 
 * *************************************************************
 */
class ValidSudoku {
  private boolean checkValid(char[][] board, int x, int y, int m, int n, boolean isRow) {
    Set <Character> set = null;
    for (int i = x; i < m; i++) {
      set = new HashSet<>();
      for (int j = y; j < n; j++) {
        char c = isRow ? board[i][j] : board[j][i];
        if (c == '.') continue;
        if (set.contains(c)) return false;
        set.add(c);
      }
    }
    return true;
  }
  
  private boolean validSubBoxes(int x, int y, char[][] board) {
    Set <Character> set = new HashSet<>();
    for (int i = x; i < x + 3; i++) {
      for (int j = y; j < y + 3; j++) {
        char c = board[j][i];
        if (c == '.') continue;
        if (set.contains(c)) return false;
        set.add(c);
      }
    }
    return true;
  }
  
  public boolean isValidSudoku(char[][] board) {
    // Check Row
    if (!checkValid(board, 0, 0, 9, 9, true)) return false;
    
    // Check Column
    if (!checkValid(board, 0, 0, 9, 9, false)) return false;
    
    // Check Sub-boxes
    for (int i = 0; i < 9; i = i + 3) {
      for (int j = 0; j < 9; j = j + 3) {
        if (!validSubBoxes(i, j, board)) return false;
      }
    }
    
    return true;
  }
}



/**
 * Wonderful Solution
 * Author: StefanPochmann
 */
class ValidSudokuStefanPochmann {
  public boolean isValidSudoku(char[][] board) {
    Set seen = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            char number = board[i][j];
            if (number != '.')
                if (!seen.add(number + " in row " + i) ||
                    !seen.add(number + " in column " + j) ||
                    !seen.add(number + " in block " + i/3 + "-" + j/3))
                    return false;
        }
    }
    return true;
  }
}