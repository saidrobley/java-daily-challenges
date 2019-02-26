import java.util.HashMap;
import java.util.Map;
/* 
Given an array of size n, find the majority element. The majority element is the element 
that appears more than ⌊ n/2 ⌋ times.
*/

public class MajorityElement {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    for (int key : map.keySet()) {
      if (map.get(key) > (nums.length) / 2) {
        return key;
      }
    }
    return -1;
  }
}