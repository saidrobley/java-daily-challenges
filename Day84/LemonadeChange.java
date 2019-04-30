/* 
At a lemonade stand, each lemonade costs $5. 

Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).

Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct change to each customer, 
so that the net transaction is that the customer pays $5.
*/
public class LemonadeChange {
  public boolean lemonadeChange(int[] bills) {
    int[] array = new int[3]; // 5, 10, 20

    for (int bill : bills) {
      if (bill == 5) {
        array[0]++;
      } else if (bill == 10) {
        array[1]++;
        if (array[0] > 0) {
          array[0]--;
        } else if (array[0] == 0) {
          return false;
        }
      } else {
        array[2]++;
        if (array[0] > 0 && array[1] > 0) {
          array[0]--;
          array[1]--;
        } else if (array[0] >= 3) {
          array[0] -= 3;
        } else {
          return false;
        }
      }
    }
    return true;
  }
}