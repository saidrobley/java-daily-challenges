/* 
A robot is located at the top-left corner of a m x n grid 
(marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. 
The robot is trying to reach the bottom-right corner of the grid 
(marked 'Finish' in the diagram below).

Now consider if some obstacles are added to the grids. 
How many unique paths would there be?
*/
public class UniquePathsTwo {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    if (m == 0)
      return 0;
    int n = obstacleGrid[0].length;
    int[][] dp = new int[m][n];
    for (int i = 0; i < m; i++) {
      if (obstacleGrid[i][0] == 1) {
        break;
      }
      dp[i][0] = 1;
    }
    for (int i = 0; i < n; i++) {
      if (obstacleGrid[0][i] == 1)
        break;
      dp[0][i] = 1;
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (obstacleGrid[i][j] == 1)
          continue;
        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
      }
    }
    return dp[m - 1][n - 1];
  }
}