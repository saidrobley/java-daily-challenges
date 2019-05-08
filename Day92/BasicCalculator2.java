import java.util.Stack;

/* 
mplement a basic calculator to evaluate a simple expression string.

The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.

Example 1:

Input: "3+2*2"
Output: 7
*/
public class BasicCalculator2 {
  public int calculate(String s) {
    Stack<Integer> stack = new Stack<>();
    int index = 0;
    char sign = '+';
    while (index < s.length()) {

      if (Character.isDigit(s.charAt(index))) {
        int num = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
          num = num * 10 + s.charAt(index) - '0';
          index++;
        }

        if (sign == '+') {
          stack.push(num);
        } else if (sign == '-') {

          stack.push(-1 * num);
        } else if (sign == '*') {
          stack.push(stack.pop() * num);
        } else if (sign == '/') {
          stack.push(stack.pop() / num);
        }

      } else if (isOperator(s.charAt(index))) {
        sign = s.charAt(index);
        index++;
      } else {
        index++; // empty space
      }
    }

    int result = 0;
    while (!stack.isEmpty()) {

      result += stack.pop();
    }
    return result;

  }

  public boolean isOperator(char c) {
    if (c == '+' || c == '-' || c == '*' || c == '/') {
      return true;
    } else {
      return false;
    }
  }

}