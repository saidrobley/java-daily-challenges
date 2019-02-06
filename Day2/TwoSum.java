import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 11, 15, 7], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
class TwoSum {

  public static void main(String[] arg) {
    int[] nums = { 2, 11, 15, 7 };
    int target = 9;
    System.out.println(Arrays.toString(twoSum(nums, target)));

  }

  public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (map.containsKey(diff)) {
        result[1] = i;
        result[0] = map.get(diff);
        return result;
      }
      map.put(nums[i], i);
    }
    return result;
  }
}