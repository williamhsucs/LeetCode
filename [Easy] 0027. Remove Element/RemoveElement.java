/**
 * Problem
 * https://leetcode.com/problems/remove-element/
 * 
 * ************************************************************* 
 * 
 * Input: nums = [3,2,2,3], val = 3
 * 
 * Output: 2, nums = [2,2,_,_]
 * 
 * Explanation:
 * Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * ************************************************************* 
 * 
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * 
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * 
 * Explanation:
 * Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 *   - for loop from the lenth of nums to 0
 * Space Complexity: O(1)
 *   - There is no declaration of any new variables whose memory size depends on the input value.
 *   - The memory used is always the same.
 */
class RemoveElement {
  /*
  public void show(int[] nums) {
    System.out.print("[");
    for (int i = 0; i <= nums.length - 1; i++) {
      System.out.print(nums[i] + ", ");
    }
    System.out.println("]");
  }
  */
  public int removeElement(int[] nums, int val) {
    int lowIdx = 0;
    int highIdx = nums.length - 1;

    // Run O(n)
    for (int i = 0; i <= nums.length - 1; i++) {
      //show(nums);
      if (nums[lowIdx] != val) {
        // highIdx stop and check lowIdx
        lowIdx++;
      } else if (nums[lowIdx] == val) {
        // lowIdx stop and check highIdx
        // It means the value of low index must remove and has space to store other value
        if (nums[highIdx] != val) {
          // Shift the value of high index to low index
          nums[lowIdx] = nums[highIdx];
          lowIdx++;
        }
        // High index value 100% remove
        // Because if high index value equal check value, we need to remove it.
        // If high value does not equal check value, we need to shift it to low index.
        nums[highIdx] = 0;
        highIdx--;
      }
      
      if (lowIdx > highIdx) {
        break;
      }
    }
    //show(nums);
    /**
     * Only high index can appear real array length.
     */
    //System.out.println(highIdx + 1);
    return highIdx + 1; // Need return length so we need add 1 to index.
  }
}