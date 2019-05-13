import java.util.*;

/* 
Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
*/
public class SubsetsTwo {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    sub(result, new ArrayList<>(nums.length), nums, 0);
    return result;
  }

  private static void sub(List<List<Integer>> result, List<Integer> cur, int[] nums, int pos) {
    result.add(new ArrayList<>(cur));
    for (int i = pos; i < nums.length; i++) {
      if (i == pos || nums[i] != nums[i - 1]) {
        cur.add(nums[i]);
        sub(result, cur, nums, i + 1);
        cur.remove(cur.size() - 1);
      }
    }
  }
}