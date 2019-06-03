import java.util.Arrays;

/* 
Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just  character at  index in the string, and the remaining characters will occur the same number of times. Given a string , determine if it is valid. 
If so, return YES, otherwise return NO.
*/
public class SherlockValidString {

  public static String isValid(String s) {
    int[] letters = new int[26];
    for (char c : s.toCharArray()) {
      letters[c - 'a']++;
    }
    Arrays.sort(letters);
    int i = 0;
    while (letters[i] == 0) {
      i++;
    }
    int min = letters[i];
    int max = letters[25];

    if (min == max) {
      return "YES";
    } else {
      // remove one letter at higher frequency or the lower frequency
      if (((max - min == 1) && (max > letters[24])) || (min == 1) && (letters[i + 1] == max))
        return "YES";
    }
    return "NO";

  }

}