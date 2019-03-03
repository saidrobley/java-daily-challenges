import java.util.HashMap;

/*
Given an array of numbers nums, 
in which exactly two elements appear only once 
and all the other elements appear exactly twice. 
Find the two elements that appear only once.
*/
public class SingleNumber3 {
  public int[] singleNumber(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    int[] res = new int[2];
    int i = 0;
    for (int set : map.keySet()) {
      if (map.get(set) == 1) {
        res[i] = set;
        i++;
      }
    }
    return res;

  }
}