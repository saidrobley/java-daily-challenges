/* 
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes 
that can be built with those letters.
Example:

Input:
"abccccdd"

Output:
7
*/
public class LongestPalindrome {
  public int longestPalindrome(String s) {
    int[] chars = new int[256];
    for (char c : s.toCharArray()) {
      chars[c]++;
    }
    int count = 0;
    for (int i = 0; i < 256; i++) {
      if (chars[i] % 2 != 0) {
        count++;
      }
    }
    return count > 0 ? s.length() - count + 1 : s.length();
  }
}