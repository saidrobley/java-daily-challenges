import java.lang.StringBuilder;

/* 
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/
public class AddStrings {
  public String addStrings(String num1, String num2) {
    int carry = 0;
    int n1 = num1.length() - 1;
    int n2 = num2.length() - 1;
    StringBuilder sb = new StringBuilder();
    while (n1 >= 0 || n2 >= 0) {
      int c1 = (n1 >= 0) ? num1.charAt(n1) - '0' : 0;
      int c2 = (n2 >= 0) ? num2.charAt(n2) - '0' : 0;
      int total = c1 + c2 + carry;
      carry = total / 10;
      if (total > 9) {
        total = total % 10;

      }
      sb.insert(0, total + "");
      n1--;
      n2--;
    }
    if (carry > 0) {
      sb.insert(0, carry + "");
    }
    return sb.toString();
  }
}