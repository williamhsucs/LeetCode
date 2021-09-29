/**
 * Problem
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * ************************************************************* 
 * 
 * Input: numbers = [2,7,11,15], target = 9
 * 
 * Output: [1,2]
 * 
 * ************************************************************* 
 * 
 * Input: numbers = [2,3,4], target = 6
 * 
 * Output: [1,3]
 * 
 * ************************************************************* 
 * 
 * Input: numbers = [-1,0], target = -1
 * 
 * Output: [1,2]
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class TwoSumII {
  public int[] twoSum(int[] numbers, int target) {
    int front = 0;
    int rear = numbers.length - 1;
    int sum = 0;
    
    /**
     * Time Complexity: O(n)
     */
    for (int i = 0; i < numbers.length; i++) {
      sum = numbers[front] + numbers[rear];
      if (sum > target) {
        rear--;
      } else if (sum < target) {
        front++;
      } else {
        /**
         * Space Complexity: O(1)
         * Because this array is always same size.
         */
        return new int[]{front + 1, rear + 1};
      }
    }
    return null;
  }
}

/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class TwoSumMap {
  public int[] twoSum(int[] numbers, int target) {  
    /**
     * Space Complexity: O(n)
     */
    Map<Integer, Integer> map = new HashMap<>();
    
    /**
     * Time Complexity: O(n)
     */
    for (int i = 0; i < numbers.length; i++) {
      if (map.get(numbers[i]) != null) {
        return new int[]{map.get(numbers[i]) + 1, i + 1};
      } else {
        map.put(target - numbers[i], i);
      }
    }
    return null;
  }
}