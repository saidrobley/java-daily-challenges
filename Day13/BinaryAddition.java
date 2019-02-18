/* 
Given two binary strings, return their sum (also a binary string).
The input strings are both non-empty and contains only characters 1 or 0.
Example 1:
Input: a = "11", b = "1"
Output: "100"
*/
public class BinaryAddition {

  public String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int i = a.length() - 1, j = b.length() - 1, carry = 0;
    while (i >= 0 || j >= 0) {
      int sum = carry;
      if (j >= 0)
        sum += b.charAt(j--) - '0';
      if (i >= 0)
        sum += a.charAt(i--) - '0';
      result.insert(0, sum % 2);
      carry = sum / 2;
    }
    if (carry != 0)
      result.insert(0, carry);
    // return result.reverse().toString()
    return result.toString();
  }
}
