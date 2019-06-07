public class UniqueCharacters {
  public static void main(String[] args) {
    System.out.println(isUniqueChars("abcdefghi1"));
  }

  public static boolean isUniqueChars(String str) {
    if (str.length() > 128)
      return false;
    boolean[] charSet = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      int index = str.charAt(i);
      if (charSet[index]) {
        return false;
      }
      charSet[index] = true;
    }
    return true;
  }
}