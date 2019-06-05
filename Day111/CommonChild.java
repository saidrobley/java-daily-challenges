/* 
A string is said to be a child of a another string if it can be formed by deleting 0 or more characters from the other string. 
Given two strings of equal length, what's the longest string that can be constructed such that it is a child of both?

*/
public class CommonChild {
  public int commonChild(String s1, String s2) {
    int[][] dp = new int[s1.length() + 1][s2.length() + 1];

    for (int i = 0; i < s1.length(); i++) {
      for (int j = 0; j < s2.length(); j++) {
        if (s1.charAt(i) == s2.charAt(j)) {
          dp[i + 1][j + 1] = dp[i][j] + 1;
        } else {
          dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
        }
      }
    }

    return dp[s1.length()][s2.length()];
  }
}