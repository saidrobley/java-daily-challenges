import java.util.HashMap;

/* 
Given a string, find the first non-repeating character in it and return it's index. 
If it doesn't exist, return -1.
Examples:
s = "leetcode"
return 0.
s = "loveleetcode",
return 2.
*/
public class FirstUniqueChar {
  public int firstUniqChar(String s) {

    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (!map.containsKey(c)) {
        map.put(c, i);
      } else {
        map.put(c, -1);
      }
    }
    int min = Integer.MAX_VALUE;
    for (char c : map.keySet()) {
      if (map.get(c) > -1 && map.get(c) < min) {
        min = map.get(c);
      }
    }
    return min == Integer.MAX_VALUE ? -1 : min;
  }
}