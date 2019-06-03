/* 
You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters.
*/
public class AlternatingCharacters {
  public int alternatingCharacters(String s) {
    int i = 0;
    int j = 1;
    int res = 0;
    while (j < s.length()) {
      if (s.charAt(i) == s.charAt(j)) {
        res++;

      }
      i++;
      j++;
    }
    return res;
  }
}