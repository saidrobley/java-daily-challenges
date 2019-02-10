import java.util.Stack;
/* 
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.
*/

public class ValidParintheses {
  public static void main(String[] arg) {
    System.out.println(isValidParentheses("()"));
    System.out.println(isValidParentheses("()[]{}"));
    System.out.println(isValidParentheses("([)]"));
    System.out.println(isValidParentheses("{[]}"));
  }

  public static boolean isValidParentheses(String s) {
    Stack<Character> stack = new Stack();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else if (!stack.empty()) {
        char peek = stack.peek();
        if (((peek == '(') && (ch == ')')) || ((peek == '{') && (ch == '}')) || ((peek == '[') && (ch == ']'))) {
          stack.pop();
        } else {
          return false;
        }

      } else {
        return false;
      }
    }
    return stack.empty() ? true : false;
  }
}