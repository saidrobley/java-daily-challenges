import java.util.*;

public class StringCompression {
  public static void main(String[] args) {

    System.out.println(getCountCompression("aabcccaa"));
    // output: a4b1c3
  }

  public static String getCountCompression(String str) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : str.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    StringBuilder sb = new StringBuilder();
    for (char c : map.keySet()) {
      sb.append(c);
      sb.append(map.get(c).toString());
    }
    return sb.toString();
  }
}