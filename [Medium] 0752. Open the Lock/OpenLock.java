import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
  // Use BFS
  public int openLock(String[] deadends, String target) {
    if (target.equals("0000")) return 0;
    Set<String> visited = new HashSet<>();
    for (String s : deadends) {
      visited.add(s);
    }
    if (visited.contains("0000")) return -1;

    Queue<String> queue = new LinkedList<>();
    queue.offer("0000");
    visited.add("0000");

    int step = 0;

    while (!queue.isEmpty()) {
      step++;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        // Time O(1)
        for (int j = 0; j < 4; j++) {
          // Time O(1)
          for (int x = -1; x <= 1; x += 2) {
            char[] next = queue.peek().toCharArray();
            int unit = Integer.valueOf(next[j] - '0');
            unit = ((unit + x + 10) % 10);
            next[j] = (char) (unit + '0');
            String path = new String(next);
            if (path.equals(target)) return step;
            else if (visited.contains(path)) continue;
            else {
              queue.offer(path);
              visited.add(path);
            }
          }
        }
        queue.poll();
      }
    }
    return -1;
  }
}