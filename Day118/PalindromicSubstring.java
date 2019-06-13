/* 
Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:

Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
*/
public class PalindromicSubstring {
  public int countSubstrings(String s) {
    if (s.length() == 0)
      return 0;
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      int len1 = checkPalindrome(s, i, i);
      int len2 = checkPalindrome(s, i, i + 1);
      count += len1 + len2;
    }
    return count;
  }

  public int checkPalindrome(String str, int beg, int end) {
    int tempCount = 0;
    while (beg >= 0 && end < str.length() && str.charAt(beg) == str.charAt(end)) {
      tempCount++;
      beg--;
      end++;
    }
    return tempCount;
  }
}