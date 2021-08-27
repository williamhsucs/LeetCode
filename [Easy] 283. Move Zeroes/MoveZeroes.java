class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int bufferIdx = 0;
    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] != 0) {
        nums[bufferIdx++] = nums[i];
      }
    }
    for (int i = bufferIdx; i <= nums.length - 1; i++) {
      nums[bufferIdx++] = 0;
    }
  }
}