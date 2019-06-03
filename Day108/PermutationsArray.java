import java.util.*;

/* 
Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
*/
public class PermutationsArray {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> inner = new ArrayList<>();
    getPermutaion(nums, res, inner);
    return res;
  }

  public void getPermutaion(int[] nums, List<List<Integer>> res, List<Integer> inner) {
    if (inner.size() == nums.length) {
      res.add(new ArrayList<>(inner));
    } else {

      for (int i = 0; i < nums.length; i++) {

        if (inner.contains(nums[i])) {
          // If element already exists in the res then skip
          continue;
        }
        // Choose element
        inner.add(nums[i]);
        // Explore
        getPermutaion(nums, res, inner);
        // Unchoose element
        inner.remove(inner.size() - 1);
      }

    }

  }
}