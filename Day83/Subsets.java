import java.util.*;

/* 
Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/
public class Subsets {
  public List<List<Integer>> subsets(int[] nums) {

    List<List<Integer>> results = new ArrayList<>();
    helper(nums, results);
    return results;

  }

  public void helper(int[] nums, List<List<Integer>> results) {

    results.add(new ArrayList<>());

    for (int i = 0; i < nums.length; i++) {
      int n = results.size();
      for (int j = 0; j < n; j++) {
        List<Integer> temp = new ArrayList<>(results.get(j));
        temp.add(nums[i]);
        results.add(temp);
      }
    }
  }
}