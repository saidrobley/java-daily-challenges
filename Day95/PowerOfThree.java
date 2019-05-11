/* 
Given an integer, write a function to determine if it is a power of three.

Example 1:

Input: 27
Output: true
Example 2:

Input: 0
Output: false
*/
public class PowerOfThree {
  public boolean isPowerOfThree(int n) {
    while (n % 3 == 0 && n > 1) {
      n /= 3;
    }
    return n == 1;
  }
}