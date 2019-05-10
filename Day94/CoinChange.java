/* 
You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:

Input: coins = [1, 2, 5], amount = 11
Output: 3 
Explanation: 11 = 5 + 5 + 1
*/
public class CoinChange {
  public int coinChange(int[] coins, int amount) {
    int[] f = new int[amount + 1];
    int n = coins.length;
    f[0] = 0;
    for (int i = 1; i <= amount; ++i) {
      f[i] = Integer.MAX_VALUE;
      for (int j = 0; j < n; ++j) {
        if (i - coins[j] >= 0 && f[i - coins[j]] != Integer.MAX_VALUE) {
          f[i] = Math.min(f[i], f[i - coins[j]] + 1);
        }
      }
    }
    if (f[amount] == Integer.MAX_VALUE) {
      f[amount] = -1;
    }
    return f[amount];
  }
}