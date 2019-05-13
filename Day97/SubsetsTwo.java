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
    List<Integer> subset = new ArrayList<>();
    if (nums == null || nums.length == 0) {
      return result;
    }

    findAllSubset(nums, result, subset, 0);
    return result;
  }

  private void findAllSubset(int[] nums, List<List<Integer>> result, List<Integer> subset, int position) {

    result.add(new ArrayList<>(subset));
    for (int i = position; i < nums.length; i++) {
      if (i > position && nums[i] == nums[i - 1]) {
        continue;
      }
      subset.add(nums[i]);
      findAllSubset(nums, result, subset, i + 1);
      subset.remove(subset.size() - 1);
    }
  }
}