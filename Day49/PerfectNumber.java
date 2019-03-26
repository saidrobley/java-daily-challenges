/* 
given an integer n, write a function that returns true when it is a perfect number and false when it is not.
Example:
Input: 28
Output: True
Explanation: 28 = 1 + 2 + 4 + 7 + 14
*/
public class PerfectNumber {
  public boolean checkPerfectNumber(int num) {
    if (num <= 1) {
      return false;
    }
    int sum = 1;
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        sum += i;
        if (i * i != num) {
          sum += num / i;
        }
      }
    }
    return sum == num ? true : false;
  }
}