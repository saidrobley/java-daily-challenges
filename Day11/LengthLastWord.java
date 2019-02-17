/* 
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
If the last word does not exist, return 0.

*/
public class LengthLastWord {
  public int lengthOfLastWord(String s) {
    int len = 0;
    String str = s.trim();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        len = 0;
      } else {
        len++;
      }
    }
    return len;
  }
}