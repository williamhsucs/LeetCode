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
int* sortedSquares(int* nums, int numsSize, int* returnSize) {
    int* retAry = calloc(numsSize, sizeof(int));
    int posLow = 0;
    int posHigh = numsSize - 1;
    int squareLow = 0;
    int squareHigh = 0;
    *returnSize = numsSize;
    
    while (numsSize-- > 0) {
        squareLow = nums[posLow] * nums[posLow];
        squareHigh = nums[posHigh] * nums[posHigh];
        
        if (squareLow > squareHigh) {
            retAry[numsSize] = squareLow;
            posLow++;
        } else {
            retAry[numsSize] = squareHigh;
            posHigh--;
        }
    }
    
    return retAry;
}