/* 
Given an array of integers that is already sorted in 
ascending order, find two numbers such that they add up 
to a specific target number.
*/
public class SumTwo {
  public int[] twoSum(int[] numbers, int target) {
    int[] res = new int[2];
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          res[0] = ++i;
          res[1] = ++j;
          return res;
        }
      }
    }
    return res;

  }
}