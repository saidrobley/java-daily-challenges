import java.util.HashSet;

/*
Given two arrays, write a function to compute their intersection.
Example:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
*/
public class IntersectionTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    for (int num : nums1)
      set1.add(num);
    for (int num : nums2) {
      if (set1.contains(num)) {
        set2.add(num);
      }
    }
    int[] res = new int[set2.size()];
    int index = 0;
    for (int num : set2) {
      res[index++] = num;
    }
    return res;
  }
}