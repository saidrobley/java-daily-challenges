import java.util.ArrayList;
import java.util.Arrays;

/* 
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
*/
public class IntersectionTwoArrays {
  public int[] intersect(int[] nums1, int[] nums2) {
    ArrayList<Integer> res = new ArrayList<>();
    if (nums1.length == 0)
      return nums1;
    if (nums2.length == 0)
      return nums2;
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i = 0, j = 0, k = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j])
        i++;
      else if (nums2[j] < nums1[i])
        j++;
      else if (nums1[i] == nums2[j]) {
        // nums1[k++]=nums1[i];
        res.add(nums1[i]);
        i++;
        j++;
      }
    }

    int[] res2 = new int[res.size()];
    for (int i2 = 0; i2 < res.size(); i2++) {
      res2[i2] = res.get(i2);
    }
    return res2;

  }
}