public class StringRotation {

  public static boolean stringRotation(String s1, String s2) {
    int len = s1.length() - 1;
    int i = 0;
    while (i < len) {
      String x = s1.substring(0, i + 1);
      String y = s1.substring(i + 1);
      String yx = y + x;
      if (yx.equals(s2)) {
        return true;
      }
      i++;
    }
    return false;
  }
}