/**
 * Problem
 * https://leetcode.com/problems/spiral-matrix/
 * 
 * ************************************************************* 
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 
 * Output: [1,2,3,6,9,8,7,4,5]
 * 
 * ************************************************************* 
 * 
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * ************************************************************* 
 * 
 * Time Complexity: O(mn)
 * Space Complexity: O(mn)
 */

class SpiralMatrix {
  public List<Integer> spiralOrder(int[][] matrix) {
    int m = matrix.length - 1;
    int n = matrix[0].length - 1;
    int i =  (m + 1) * (n + 1);
    int ver = 0;
    int hor = 0;
    int count = 0;
    boolean right = n > 0 ? true : false;
    boolean bottom = n > 0 ? false : true;
    boolean left = false;
    boolean up = false;
    boolean firstRight = true;
    
    /**
     * Space Complexity: O(mn)
     */
    List<Integer> list = new ArrayList<>();
    list.add(matrix[ver][hor]);
    
    /**
     * Time Complexcity: O(mn)
     */
    while (i-- > 1) {
      if (right) {
        hor++;
        count++;
        if (count == n) {
          right = false;
          bottom = true;
          if (firstRight) {
            firstRight = false;
          } else {
            n--;
          }
          count = 0;
        }
      } else if (bottom) {
        ver++;
        count++;
        if (count == m) {
          bottom = false;
          left = true;
          m--;
          count = 0;
        }
      } else if (left) {
        hor--;
        count++;
        if (count == n) {
          left = false;
          up = true;
          n--;
          count = 0;
        }
      } else if (up) {
        ver--;
        count++;
        if (count == m) {
          up = false;
          right = true;
          m--;
          count = 0;
        }
      }
      list.add(matrix[ver][hor]);
    }
    return list;
  }
}