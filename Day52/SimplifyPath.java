import java.util.*;

/* 
Given an absolute path for a file (Unix-style), simplify it. Or in other words, convert it to the canonical path.
Example:

Input: "/home/"
Output: "/home"
*/
public class SimplifyPath {
  public String simplifyPath(String path) {
    String[] decode = path.split("/");
    Stack<String> stack = new Stack();
    StringBuilder sb = new StringBuilder();
    for (String cur : decode) {
      if (cur.equals("") || cur.equals(".")) {
        continue;
      }
      if (cur.equals("..")) {
        if (!stack.isEmpty())
          stack.pop();
      } else {
        stack.push(cur);
      }
    }
    for (String cur : stack) {
      sb.append("/" + cur);
    }
    return sb.length() == 0 ? "/" : sb.toString();
  }
}