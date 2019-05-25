/* 
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
*/
public class LongestCommonPrefix {
  public String longestCommon(String[] strs) {
    String longestPrefix = "";
    if (strs == null || strs.length == 0) {
      return longestPrefix;
    }
    int index = 0;
    for (char c : strs[0].toCharArray()) {
      for (int i = 1; i < strs.length; i++) {
        if (index >= strs[i].length() || c != strs[i].charAt(index)) {
          return longestPrefix;
        }
      }
      longestPrefix += c;
      index++;
    }
    return longestPrefix;
  }
}