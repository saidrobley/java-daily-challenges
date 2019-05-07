/* 
Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].
After this process, we have some array B.

*/
public class SmallestRange {
  public int smallestRangeI(int[] A, int K) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int n : A) {
      min = Math.min(min, n);
      max = Math.max(max, n);
    }
    return (min + K > max - K) ? 0 : max - min - 2 * K;

  }
}