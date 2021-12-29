public class Solution {
  public int numSquares(int n) {
    if (n == 1) return n;
    // Space O(sqrt(n))
    Queue<Integer> queue = new LinkedList<>();

    for (int i = (int) Math.floor(Math.sqrt(n)); i > 0; i--) {
      queue.offer(i);
    }
    int minStep = Integer.MAX_VALUE;

    while (!queue.isEmpty()) {
      int maxSqrtRoot = queue.poll();
      for (int i = maxSqrtRoot; i > 0; i--) {
        int target = n - (maxSqrtRoot * maxSqrtRoot);
        int step = 1;
        int sqrtRoot = i;
        while (sqrtRoot > 0) {
          if (step > minStep) break;
          int sqrt = sqrtRoot * sqrtRoot;
          while (target - sqrt >= 0) {
            target -= sqrt;
            step++;
          }
          sqrtRoot--;
        }
        if (step < minStep) {
          minStep = step;
        }
      }
    }
    return minStep;
  }
}