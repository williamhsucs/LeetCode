/**
 * Time O(n)
 * Space (sqrt(n))
 */
public class PerfectSquares {
  public int numSquares(int n) {
    if (n == 1) return n;
    // Space O(sqrt(n))
    Queue<Integer> queue = new LinkedList<>();

    // Time O(sqrt(n))
    for (int i = (int) Math.floor(Math.sqrt(n)); i > 0; i--) {
      queue.offer(i);
    }
    int minStep = Integer.MAX_VALUE;

    /**
     * Time O(n)
     *  Four nest loop for each time cost O(sqrt(n)) should be O(sqrt(n)^4) -> O(n^2)
     *  However, I used the minStep to break the worst events,
     *  So, the time complexity will be closely O(n)
     */
    // Time O(sqrt(n))
    while (!queue.isEmpty()) {
      int maxSqrtRoot = queue.poll();
      // Time O(sqrt(n))
      for (int i = maxSqrtRoot; i > 0; i--) {
        int target = n - (maxSqrtRoot * maxSqrtRoot);
        int step = 1;
        int sqrtRoot = i;
        // Time O(sqrt(n))
        while (sqrtRoot > 0) {
          if (step > minStep) break;
          int sqrt = sqrtRoot * sqrtRoot;
          // Time O(sqrt(n))
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