/* 
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
Note that you cannot sell a stock before you buy one.
*/
public class BuyStock {
  public int maxProfit(int[] prices) {
    int max = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[j] - prices[i] > max) {
          max = prices[j] - prices[i];
          System.out.println(max + " " + i + " " + j);
        }
      }
    }
    return max;

  }
}