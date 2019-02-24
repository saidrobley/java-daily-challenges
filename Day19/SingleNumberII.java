import java.util.Map;
import java.util.HashMap;

/*
Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
public class SingleNumberII {
  public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    for (int key : map.keySet()) {
      if (map.get(key) == 1)
        return key;
    }

    return -1;
  }
}