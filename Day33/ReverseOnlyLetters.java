/* 
Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, 
and all letters reverse their positions.
*/
public class ReverseOnlyLetters {
  public String reverseOnlyLetters(String S) {
    int i = 0;
    int j = S.length() - 1;
    char[] arr = S.toCharArray();
    while (i <= j) {
      char temp1 = arr[i];
      char temp2 = arr[j];
      if (!Character.isLetter(temp1)) {
        i++;

      } else if (!Character.isLetter(temp2)) {
        j--;
      } else {
        arr[i] = arr[j];
        arr[j] = temp1;
        i++;
        j--;
      }
    }
    return new String(arr);
  }
}