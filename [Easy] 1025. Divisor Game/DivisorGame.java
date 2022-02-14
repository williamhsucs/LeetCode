/**
 * Use DP to solve this problem.
 * Number 1, Alice can't move anymore -> Alice can't win -> False
 * Number 2, Alice can take out of 1 and leave number 1 to Bob
 *           -> We know number 1 can't win by previous result. -> Bob can't move anymore
 *           -> Alice win -> True
 * Number 3, Alice only can take out of number 1 and leave number 2 to Bob
 *           -> We know number 2 can win by previous result. -> Bob can win
 *           -> Alice lose -> False;
 * Number 4, Alice has two options -> Alice need to find a way that Bob will lose
 *           -> We know number 3 can't win by previous result
 *           -> So, Alice need to take out of number 1 and leave number 3 to Bob
 *           -> Alice win -> Ture
 * ...
 * According to the process, we can find that the number will be True if it exists an option False.
 * 
 * This is an example:
 *                        8(T)
 *          ______________|______________
 *      -4 /              | -2           \ -1
 *        4(T)            6(T)            7(F)
 *      __|__           __|__             | -1
 *  -2 /     \ -1   -3 /-2|  \ -1         6
 *    2(T)    3(F)    3   4   5(F)
 * -1 |       | -1            |
 *    1(F)    2               4
 * 
 * And we can find that when the number is odd, Alice always lose.
 * If the number is even, Alice always win.
 */
class DivisorGame {
  /**
   * Time O(1)
   * Space O(1)
   */
  public boolean divisorGame(int n) {
    return n % 2 == 0;
  }
}