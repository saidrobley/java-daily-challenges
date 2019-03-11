/* 
Given an array A of non-negative integers, half of the integers in A are odd, 
and half of the integers are even.
*/
public class SortArrayByParity2 {
  public int[] sortArrayByParityII(int[] A) {
    int[] res = new int[A.length];
    int i = 0;
    int j = 1;
    for (int a : A) {
      if (a % 2 == 0) {
        res[i] = a;
        i += 2;
      } else {
        res[j] = a;
        j += 2;
      }
    }
    return res;
  }
}