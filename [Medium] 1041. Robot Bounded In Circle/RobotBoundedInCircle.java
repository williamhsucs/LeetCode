/**
 * Problem
 * https://leetcode.com/problems/robot-bounded-in-circle/
 * 
 * ************************************************************* 
 * 
 * Input: instructions = "GGLLGG"
 * 
 * Output: true
 * 
 * ************************************************************* 
 * 
 * Input: instructions = "GG"
 * 
 * Output: false
 * 
 * ************************************************************* 
 * 
 * Input: instructions = "GL"
 * 
 * Output: true
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class RobotBoundedInCircle {
  public boolean isRobotBounded(String instructions) {
    boolean north = true;
    boolean east = false;
    boolean west = false;
    boolean south = false;
    
    int ver = 0;
    int hor = 0;
    
    /**
     * Time Complexity: O(1)
     */
    for (int i = 0; i < 4; i++) {    
      /**
       * Time Complexity: O(n)
       */
      for (int j = 0; j < instructions.length(); j++) {
        if (instructions.charAt(j) == 'G') {
          if (north) {
            ver++;
          } else if (east) {
            hor++;
          } else if (west) {
            hor--;
          } else {
            ver--;
          }
        } else if (instructions.charAt(j) == 'L') {
          if (north) {
            north = false;
            west = true;
          } else if (west) {
            west = false;
            south = true;
          } else if (south) {
            south = false;
            east = true;
          } else if (east) {
            east = false;
            north = true;
          }
        } else {
          if (north) {
            north = false;
            east = true;
          } else if (east) {
            east = false;
            south = true;
          } else if (south) {
            south = false;
            west = true;
          } else if (west) {
            west = false;
            north = true;
          }
        }
      }

      if (ver == 0 && hor == 0) {
        return true;
      }
    }
    
    return false;
  }
}