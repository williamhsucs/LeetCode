/**
 * Use Sum
 *  - Time O(n)
 *  - Space O(1)
 */
class MissingNumberSum {
  public int missingNumber(int[] nums) {
    int sum = 0;
    
    // Time O(n)
    for (int i = 0; i < nums.length; i++) {
      sum += i;
      sum -= nums[i];
    }
    
    return sum + nums.length;
  }
}

/**
 * Use Binary (XOR)
 *  - Time O(n)
 *  - Space O(1)
 */
class MissingNumberBinary {
  public int missingNumber(int[] nums) {
    int sum = nums.length;
    
    // Time O(n)
    for (int i = 0; i < nums.length; i++) {
      sum = sum ^ i ^ nums[i];
    }
    
    return sum;
  }
}

/**
 * Use Binary Search
 *  - Time
 *     - Array is sorted O(logn)
 *     - Array is not sorted O(nlogn)
 *  - Space O(1)
 */
class MissingNumberBS {
  public int missingNumber(int[] nums) {
    int left = 0;
    int right = nums.length;
    int mid = (left + right) / 2;
    /**
     * Array sorted O(logn)
     * Array not sorted O(nlogn)
     */
    Arrays.sort(nums);

    /**
     * Binary Search
     *  - Time O(logn)
     */
    while (left < right) {
      mid = (left + right) / 2;
      if (nums[mid] > mid) right = mid;
      else left = mid + 1;
    }
    return left;
  }
}