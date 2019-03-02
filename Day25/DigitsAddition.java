/* 
Given a non-negative integer num, 
repeatedly add all its digits until the result has only one digit.
*/
public class DigitsAddition {

  public int addDigits(int num) {
    while (num >= 10) {
      num = num / 10 + num % 10;
    }
    return num;
  }
}