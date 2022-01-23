class CourseSchedule {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    /**
     * Space O(n)
     * After finish course i, you can take what course.
     */
    ArrayList<Integer>[] preq = new ArrayList[numCourses];
    /**
     * Space O(n)
     * How many courses should take if you want to take course i.
     */
    int[] needTake = new int[numCourses];
    /**
     * Space O(n)
     * How many courses should take if you want to take course i.
     */
    ArrayList<Integer> tookCourses = new ArrayList<>();
    /**
     * Time O(n)
     * Complete preq and neetTake
     */
    for (int i = 0; i < prerequisites.length; i++) {
      int want = prerequisites[i][0];
      int first = prerequisites[i][1];
      if (preq[first] == null) preq[first] = new ArrayList<>();
      preq[first].add(want);
      needTake[want]++;
    }
    /**
     * Time O(n)
     * Fill the courses that already take
     */
    for (int i = 0; i < needTake.length; i++) {
      if (needTake[i] == 0) tookCourses.add(i);
    }
    
    /**
     * Time O(m*n)
     */
    // Time O(n)
    for (int i = 0; i < tookCourses.size(); i++) {
      if (preq[tookCourses.get(i)] != null) {
        // Time (m)
        for (int course : preq[tookCourses.get(i)]) {
          if (--needTake[course] == 0) tookCourses.add(course);
        }
      }
    }
    
    return tookCourses.size() == numCourses;
  }
}