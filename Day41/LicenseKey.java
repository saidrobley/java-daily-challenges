/* 
Input: S = "5F3Z-2e-9-w", K = 4
Output: "5F3Z-2E9W"
Explanation: The string S has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
*/
public class LicenseKey {
  public String licenseKeyFormatting(String S, int K) {
    StringBuilder sb = new StringBuilder();
    // pointer for each char
    int i = S.length() - 1;
    int count = 0;
    while (i >= 0) {
      char curr = Character.toUpperCase(S.charAt(i));
      if (curr == '-') {
        i--;
      } else if (count != 0 && count % K == 0) {
        sb.insert(0, '-');
        count = 0;
      } else {
        sb.insert(0, curr);
        i--;
        count++;
      }
    }
    return sb.toString();

  }
}