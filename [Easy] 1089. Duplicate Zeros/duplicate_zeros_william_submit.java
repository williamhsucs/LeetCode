/**
 * Problem
 * https://leetcode.com/problems/duplicate-zeros/
 * 
 * Input:
 * arr = [1,0,2,3,0,4,5,0]
 * 
 * Output:
 * [1,0,0,2,3,0,0,4]
 * 
 * Explanation
 * After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * 
 * ************************************************************* 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 /**
 * For the first thought.
 * The simple solution is to create a new array.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
  public void duplicateZeros(int[] arr) {
    /**
     * Declare a new array
     * And the memory size is depend on array size
     * So, Space Complexity: O(n)
     */ 
    int[] temp = new int[arr.length];
    int count = 0;
    /**
     * Run from 0 to size of array
     * So, Time complexity: O(n)
     */
    for (int i = 0; i < arr.length; i++) {
      if (count == arr.length) {
        for (int j = 0; j < temp.length; j++) arr[j] = temp[j];
        break;
      } else {
        if (arr[i] == 0) {
          temp[count++] = arr[i];
          if (count < arr.length) temp[count++] = arr[i];
        } else {
          temp[count++] = arr[i];
        }
      }
    }
  }
}

/**
 * However,
 * the notes told you that "Do the above modifications to the input array IN PLACE"
 * So, we need to improve the first solution and process data in the array they give. 
 * 
 * Time Complexity: O(2n) -> O(n)
 * Space Complexity: O(1)
 *   - We don't have create a new array.
 *     Whether input array size is big or small, the new variable we declared always same.
 */
class Solution {
  public void duplicateZeros(int[] arr) {
    int arrIdx = arr.length - 1;
    int newAryIndex = 0;
    /**
     * Run from 0 to size of array
     * So, Time complexity: O(n)
     */
    for (int i = 0; i <= arrIdx; i++) {
      if (arr[i] == 0) {
        newAryIndex++;
      }
    }
    
    newAryIndex = arrIdx + newAryIndex;
    /**
     * Run from size of array to 0
     * So, Time complexity: O(n)
     */
    for (int i = arrIdx; i >= 0; i--, newAryIndex--) {
      if (newAryIndex <= arrIdx) {
        arr[newAryIndex] = arr[i];
      }
      if (arr[i] == 0) {
        newAryIndex--;
        if (newAryIndex <= arrIdx) {
          arr[newAryIndex] = arr[i];
        }
      }
    }
  }
}

/**
 * Print for detail
 * 
 * Explaination
 * 
 * Input: [1,0,2,3,0,4,5,0]
 * 
 * index [0,1,2,3,4,5,6,7]
 * array [1,0,2,3,0,4,5,0]
 * Max index of arr is 7
 * Get 3 zero from arr.
 * 
 * "Pretend" we have a new array for copying data.
 * Max index of new ary is 10
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 * new   [ , , , , , , , , , ,  ]
 * 
 * Copy arr[7] (val: 0) to ary[10]
 * But arr[10] is overflow. So we don't need to actually copy.
 *                      →     ↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [ , , , , , , , , , ,0 ]
 * 
 * The copy value is zero. So we need to copy again.
 * Copy arr[7] (val: 0) to arr[9]
 * Again, arr[9] is overflow. So we don't need to actually copy.
 *                      →   ↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [ , , , , , , , , ,0,0 ]
 * 
 * Copy arr[6] (val: 5) to arr[8]
 * But arr[8] is overflow. So we don't need to actually copy.
 *                    →   ↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [ , , , , , , , ,5,0,0 ]
 * 
 * Copy arr[5] (val: 4) to arr[7]
 *                  →   ↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [ , , , , , , ,4,5,0,0 ]
 * 
 * Copy arr[4] (val: 0) to arr[6]
 *                →   ↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [ , , , , , ,0,4,5,0,0 ]
 * 
 * The copy value is zero. So we need to copy again.
 * Copy arr[4] (val: 0) to arr[5]
 *                → ↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [ , , , , ,0,0,4,5,0,0 ]
 * 
 * Copy arr[3] (val: 3) to arr[4]
 *              → ↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [ , , , ,3,0,0,4,5,0,0 ]
 * 
 * Copy arr[2] (val: 2) to arr[3]
 *            → ↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [ , , ,2,3,0,0,4,5,0,0 ]
 * 
 * Copy arr[1] (val: 0) to arr[2]
 *          → ↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [ , ,0,2,3,0,0,4,5,0,0 ]
 * 
 * The copy value is zero. So we need to copy again.
 * Copy arr[1] (val: 0) to arr[1]
 *          →↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [ ,0,0,2,3,0,0,4,5,0,0 ]
 * 
 * Copy arr[0] (val: 1) to arr[0]
 *        →↓
 * index [0,1,2,3,4,5,6,7,8,9,10]
 * array [1,0,2,3,0,4,5,0]
 *       [1,0,0,2,3,0,0,4,5,0,0 ]
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
  public void duplicateZeros(int[] arr) {
    int arrIdx = arr.length - 1;
    int newAryIndex = 0;
    System.out.println("Max index of arr is " + arrIdx);
    for (int i = 0; i <= arrIdx; i++) {
      if (arr[i] == 0) {
        newAryIndex++;
      }
    }
    System.out.println("Get " + newAryIndex + " zero from arr.");

    newAryIndex = arrIdx + newAryIndex;
    System.out.println("Pretend we have a new array for copying data.");
    System.out.println("Max index of new ary is " + newAryIndex);
    for (int i = arrIdx; i >= 0; i--, newAryIndex--) {
      System.out.println("Copy arr[" + i + "] (val: " + arr[i] + ") to arr[" + newAryIndex + "]");
      if (newAryIndex <= arrIdx) {
        arr[newAryIndex] = arr[i];
      } else {
        System.out.println("But arr[" + newAryIndex + "] is overflow. So we don't need to actually copy.");
      }
      if (arr[i] == 0) {
        newAryIndex--;
        System.out.println("The copy value is zero. So we need to copy again.");
        System.out.println("Copy arr[" + i + "] (val: " + arr[i] + ") to arr[" + newAryIndex + "]");
        if (newAryIndex <= arrIdx) {
          arr[newAryIndex] = arr[i];
        } else {
          System.out.println("Again, arr[" + newAryIndex + "] is overflow. So we don't need to actually copy.");
        }
      }
    }
  }
}