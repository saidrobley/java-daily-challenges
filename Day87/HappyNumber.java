import java.util.HashSet;

/*
A happy number is a number defined by the following process: 
Starting with any positive integer, replace the number by the sum 
of the squares of its digits, and repeat the process until the number 
equals 1 (where it will stay), or it loops endlessly in a cycle which 
does not include 1. Those numbers for which this process ends in 1 are happy numbers.
*/
public class HappyNumber {
  public boolean isHappy(int n) {
    HashSet<Integer> set = new HashSet<>();
    while (n != 1) {
      int curr = n;
      int sum = 0;
      while (curr != 0) {
        sum += (curr % 10) * (curr % 10);
        curr /= 10;
      }
      if (set.contains(sum)) {
        return false;
      }
      set.add(sum);
      n = sum;
    }
    return true;
  }
}