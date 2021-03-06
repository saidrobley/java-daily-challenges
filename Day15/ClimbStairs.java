/* 
You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
public class ClimbStairs {
  // Time complexity: O(n)
  // Space complexity: O(n)
  /*
   * public int climbStairs(int n) { int[] res = new int[n + 1]; if (n < 0) {
   * return 0; } if (n <= 1) { return 1; } res[0] = 1; res[1] = 1; for (int i = 2;
   * i <= n; i++) { res[i] = res[i - 1] + res[i - 2]; } return res[n]; }
   */
  public int climbStairs(int n) {
    if (n < 0)
      return 0;
    if (n < 0)
      return 1;
    int first = 1;
    int second = 2;
    for (int i = 3; i <= n; i++) {
      int third = first + second;
      first = second;
      second = third;
    }
    return second;
  }
}