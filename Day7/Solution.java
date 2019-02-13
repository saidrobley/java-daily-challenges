/* 
Given an array nums and a value val, remove all instances of that value in-place and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Given nums = [3,2,2,3], val = 3,
Your function should return length = 2, with the first two elements of nums being 2.

*/
class Solution {

  public int removeElement(int[] nums, int val) {
    int j = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != val) {
        nums[j] = nums[i];
        j++;
      }

    }
    return j;
  }
}