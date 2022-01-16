public class HammingWeight {
  // you need to treat n as an unsigned value
  /**
   * Time O(1)
   *   - n always 32 bits.
   * Space O(1)
   */
  public int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
      count += (n & 1);
      n >>>= 1;
    }
    return count;
  }
}