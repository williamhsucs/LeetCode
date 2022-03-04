class NumStudUnableEatLunchUsingQueue {
  /**
   * Time O(n^2)
   * Space O(n)
   */
  public int countStudents(int[] students, int[] sandwiches) {
    int sandIdx = 0;
    // Space O(n), where the number of students are equal to the number of sandwiches
    Queue<Integer> stuQueue = new LinkedList<>();
    // Time O(n)
    for (int i : students) {
      stuQueue.offer(i);
    }
    
    // Time O(n^2)
    while (!stuQueue.isEmpty()) {
      int size = stuQueue.size();
      for (int i = 0; i < size; i++) {
        int student = stuQueue.poll();
        if (student == sandwiches[sandIdx]) {
          sandIdx++;
          break;
        } else {
          stuQueue.offer(student);
          if (i == size - 1) {
            return stuQueue.size();
          }
        }
      }
    }
    return 0;
  }
}

class NumStudUnableEatLunch {
  /**
   * Time O(n)
   * Space O(1)
   */
  public int countStudents(int[] students, int[] sandwiches) {
    // Space O(2) -> O(1)
    int[] prefer = new int[2];
    // Time O(n)
    for (int i : students) {
      prefer[i]++;
    }
    // Time O(n)
    for (int i = 0; i < sandwiches.length; i++) {
      if (prefer[sandwiches[i]] == 0) {
        return sandwiches.length - i;
      }
      prefer[sandwiches[i]]--;
    }
    return 0;
  }
}