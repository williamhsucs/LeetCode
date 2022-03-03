class MinNumMoveSeatEveryone {
  /**
   * Time O(nlogn)
   * Space O(s)
   *  - where s is the space cost during sorting
   */
  public int minMovesToSeat(int[] seats, int[] students) {
    int sum = 0;
    // Time O(nlogn)
    Arrays.sort(seats);
    Arrays.sort(students);
    // Time O(n)
    for (int i = 0; i < seats.length; i++) {
      sum += Math.abs(seats[i] - students[i]);
    }
    
    return sum;
  }
}