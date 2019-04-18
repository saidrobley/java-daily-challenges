import java.util.List;
import java.util.ArrayList;

/* 
Given a non-negative index k where k ≤ 33, return the kth index row of 
the Pascal's triangle.
*/
public class PascalTriangleTwo {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> list = new ArrayList<>();
    int[][] memo = new int[rowIndex + 1][rowIndex + 1];
    for (int i = 0; i <= rowIndex; i++) {
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          memo[i][j] = 1;
        } else {
          memo[i][j] = memo[i - 1][j - 1] + memo[i - 1][j];
        }
        if (rowIndex == i)
          list.add(memo[i][j]);
      }

    }
    return list;
  }
}