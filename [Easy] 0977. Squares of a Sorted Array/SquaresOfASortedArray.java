/**
 * Problem
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * 
 * Input:  [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * 
 * Input:  [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * 
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
/**
 * Explain:
 * 
 * nums = [-4,-1,0,3,10]   => Compare (-4) and 10
 *          V         V    => low pointer and high pointer
 * 
 * Add the greater one into last place of return array.
 * retAry = [0,0,0,0,100]  => 10^2 is greater than (-4)^2
 * 
 * nums = [-4,-1,0,3,10]   => Move high pointer to next place.
 *          V      V          Compare (-4) and 3
 * 
 * Add the greater one into (last place - 1) of return array.
 * retAry = [0,0,0,16,100]  => (-4)^2 is greater than 3^2
 * 
 * nums = [-4,-1,0,3,10]   => Move low pointer to next place.
 *             V   V          Compare (-1) and 3
 * 
 * *************************************************************
 * Time complexity: O(n)
 * Worst case:
 * while -> O(n)
 * *************************************************************
 * Space complexity: O(n)
 * Worst case:
 * retAry -> O(n)
 * nums   -> O(n)
 * O(2n)  -> O(n)
 */
/**
 * Readable & Scalable
 */
class SquaresOfASortedArray1 {
    public int[] sortedSquares(int[] nums) {
        int numsLen = nums.length;
        int[] retAry = new int[numsLen];
        int posLow = 0;
        int posHigh = numsLen - 1;
        
        while (numsLen-- > 0) {
            if (Math.abs(nums[posLow]) > Math.abs(nums[posHigh])) {
                retAry[numsLen] = nums[posLow] * nums[posLow];
                posLow++;
            } else {
                retAry[numsLen] = nums[posHigh] * nums[posHigh];
                posHigh--;
            }
        }
        
        return retAry;
    }
}

class SquaresOfASortedArray2 {
  public int[] sortedSquares(int[] nums) {
    int[] ary = new int[nums.length];
    int low = 0, high = nums.length - 1;
    for (int i = high; i >= 0; i--) {
      ary[i] = Math.pow(nums[low], 2) > Math.pow(nums[high], 2) ? (int) Math.pow(nums[low++], 2) : (int) Math.pow(nums[high--], 2);
    }
    return ary;
  }
}