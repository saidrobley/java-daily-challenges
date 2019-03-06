import java.util.Arrays;
/* 
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. 
The time complexity must be in O(n).
Example 1:
Input: [3, 2, 1]
Output: 1

Example 2:
Input: [1, 2]
Output: 2

Example 3:
Input: [2, 2, 3, 1]
Output: 1
*/

public class ThirdMaxNum {
  public int thirdMax(int[] nums) {
    Arrays.sort(nums);
    int count = 1;
    for (int i = nums.length - 1; i > 0; i--) {
      if (count == 3) {
        return nums[i];
      }
      if (nums[i] != nums[i - 1]) {
        count++;
      }
    }
    if (count < 3) {
      return nums[nums.length - 1];
    }
    return nums[0];

  }
}