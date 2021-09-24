/**
 * Time Complexity: O(mn)
 * Space Complexity: O(mn)
 */
class DiagonalTraverse {
  public int[] findDiagonalOrder(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;
    
    if (m == 1) {
      return mat[0];
    }
    
    int i = 0;
    int j = 0;
    int idx = 0;
    int ingress = 0;
    
    /**
     * Space Complexity: O(mn)
     */
    int[] ary = new int[m-- * n--];
    
    ary[idx++] = mat[i][j];
    System.out.println("\ti: " + i + ",\tj: " + j + "\tm: " + m + ",\tn: " + n + ",\tary[" + (idx-1) + "]:" + ary[idx-1]);
    
    /**
     * Time Complexity: O(mn)
     */
    while (i != m || j != n) {
      if (ingress == 0) {
        // ingress ↗
        if ((i - 1 >= 0) && (j + 1 <= n)) {
          // can goto ↗
          i--;
          j++;
          System.out.print("↗\t");
        } else {
          // can't goto ↗, change ingress to ↙
          ingress = 1;
          if ((j + 1 <= n)) {
            // can goto →
            j++;
            System.out.print("↗→\t");
          } else {
            // can't goto →, goto ↓
            i++;
            System.out.print("↗↓\t");
          }
        }
      } else {
        // ingress ↙
        if ((j - 1 >= 0) && (i + 1 <= m)) {
          // can goto ↙
          i++;
          j--;
          System.out.print("↙\t");
        } else {
          // can't goto ↙, change ingress to ↗
          ingress = 0;
          if ((i + 1 <= m)) {
            // can goto ↓
            i++;
            System.out.print("↙↓\t");
          } else {
            // can't goto ↓, goto →
            j++;
            System.out.print("↙→\t");
          }
        }
      }
      ary[idx++] = mat[i][j];
      System.out.println("i: " + i + ",\tj: " + j + ", \tm: " + m + ",\tn: " + n + ",\tary[" + (idx-1) + "]:" + ary[idx-1]);
    }

    return ary;
  }
}