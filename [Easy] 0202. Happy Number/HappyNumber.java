/**
 * Problem
 * https://leetcode.com/problems/happy-number/
 * 
 * ************************************************************* 
 * 
 * Input: n = 19
 * 
 * Output: true
 * 
 * Explanation:
 * 
 * 1^2 + 9^2 = 82
 * 
 * 8^2 + 2^2 = 68
 * 
 * 6^2 + 8^2 = 100
 * 
 * 1^2 + 0^2 + 0^2 = 1
 * 
 * ************************************************************* 
 * 
 * Input: n = 2
 * 
 * Output: false
 * 
 * ************************************************************* 
 */
class HappyNumber {
  public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
    int sum = 0;
    
    while (true) {
      sum += (int) Math.pow(n % 10, 2);
      n = n / 10;
      if (n == 0) {
        if (sum == 1) {
          return true;
        }
        if (set.contains(sum)) {
          return false;
        }
        set.add(sum);
        n = sum;
        sum = 0;
      } 
    }
  }
}