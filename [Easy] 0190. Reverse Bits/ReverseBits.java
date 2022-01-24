public class ReverseBits {
  /**
   * Time O(1), Constant time
   * Space O(1)
   */
  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int ret = 0;
    int count = 32;
    // Time O(1)
    while (count-- > 0) {
      ret <<= 1;
      ret |= (n & 1);
      n >>>= 1;
    }
    return ret;
  }
}