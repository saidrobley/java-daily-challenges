/*
Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"
*/
public class BaseSeven {
  public String convertToBase7(int num) {
    if (num == 0)
      return new String("0");
    StringBuilder sb = new StringBuilder();
    Boolean isNeg = num < 0;
    num = Math.abs(num);

    while (num != 0) {
      int rm = num % 7;
      sb.insert(0, rm);
      num = num / 7;
    }

    return isNeg ? "-" + sb.toString() : sb.toString();

  }
}