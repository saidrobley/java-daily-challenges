/* 
Given a sorted array nums, remove the duplicates 
in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
*/
public class RemoveDuplicates {
  public int removeDuplicates(int[] nums) {
    if (nums.length <= 2)
      return nums.length;
    int end = 2;
    for (int i = 2; i < nums.length; i++) {
      if (nums[end - 2] != nums[i]) {
        nums[end++] = nums[i];
      }
    }
    return end;
  }
}