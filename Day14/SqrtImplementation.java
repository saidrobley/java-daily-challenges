/* 
Implement int sqrt(int x).
Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
*/
public class SqrtImplementation {
  public int mySqrt(int x) {
    long start = 0;
    long end = x;
    while (start + 1 < end) {
      long mid = start + (end - start) / 2;
      if (mid * mid == x) {
        return (int) mid;
      } else if (mid * mid < x) {
        start = mid;
      } else {
        end = mid;
      }
    }
    if (end * end == x) {
      return (int) end;
    }
    return (int) start;

  }
}