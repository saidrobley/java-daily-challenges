import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {
  public List<List<Integer>> generate(int numRows) {
    if (numRows == 0)
      return new ArrayList<>();
    List<List<Integer>> pascal = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    int[][] memo = new int[numRows][numRows];
    memo[0][0] = 1;
    list.add(memo[0][0]);
    pascal.add(list);
    for (int i = 1; i < numRows; i++) {
      list = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (i == j || j == 0) {
          memo[i][j] = 1;
        } else {
          memo[i][j] = memo[i - 1][j - 1] + memo[i - 1][j];
        }
        list.add(memo[i][j]);
      }
      pascal.add(list);
    }

    return pascal;
  }
}