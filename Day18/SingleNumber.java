import java.util.ArrayList;

/* 
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Example 1:
Input: [2,2,1]
Output: 1
*/
public class SingleNumber {
  public int singleNumber(int[] nums) {
    ArrayList<String> list = new ArrayList<>();
    for (int num : nums) {
      String str = Integer.toString(num);
      if (!list.contains(str)) {
        list.add(str);
      } else {

        list.remove(str);

      }
    }
    int res = Integer.parseInt(list.get(0));
    return res;

  }
}