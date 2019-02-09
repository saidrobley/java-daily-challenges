/*
Determine whether an integer is a palindrome. 
An integer is a palindrome when it reads the same backward as forward.
*/
public class PalindromNumber {
  public static void main(String[] args) {
    System.out.println(checkPalindrom(121));
    System.out.println(checkPalindrom(1234));
    System.out.println(checkPalindrom(-121));
  }

  public static boolean checkPalindrom(int num) {
    String n = Integer.toString(num);
    int i = 0;
    int j = n.length() - 1;
    while (i <= j) {
      if (n.charAt(i) == n.charAt(j)) {
        i++;
        j--;
      } else {
        return false;
      }
    }
    return true;
  }
}