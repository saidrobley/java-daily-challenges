/* 
Given a non-empty integer array of size n, 
find the minimum number of moves required to make all array elements equal,
where a move is incrementing n - 1 elements by 1.
*/
public class MinimumMoves {
  public int minMoves(int[] nums) {
    int min = nums[0];
    int sum = 0;
    for (int n : nums) {
      min = Math.min(min, n);
      sum += n;
    }
    return sum - nums.length * min;

  }
}