class NextPermutation {
  /**
   * Time O(n)
   * Space O(1)
   */
  public void nextPermutation(int[] nums) {
    int i = nums.length - 2;
    // Time O(n)
    while (i >= 0 && nums[i] >= nums[i + 1]) {
      i--;
    }
    
    if (i >= 0) {
      int j = nums.length - 1;
      // Time O(n)
      while (nums[i] >= nums[j]) {
        j--;
      }
      // Time O(1)
      swap(nums, i, j);
    }
    // Time O(1)
    reverse(nums, i + 1);
  }
  
  /**
   * Time O(1)
   * Space O(1)
   */
  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  
  /**
   * Time O(n)
   * Space O(1)
   */
  private void reverse(int[] nums, int i) {
    int j = nums.length - 1;
    while (i < j) {
      swap(nums, i++, j--);
    }
  }
}