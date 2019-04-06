/* 
Given an array with n objects colored red, white or blue, sort them in-place so that 
objects of the same color are adjacent, 
with the colors in the order red, white and blue.
*/
public class SortColors {
  public void sortColors(int[] nums) {
    int index = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = index; j < nums.length; j++) {
        if (nums[j] == i) {
          int temp = nums[j];
          nums[j] = nums[index];
          nums[index] = temp;
          index++;
        }
      }
    }

  }
}