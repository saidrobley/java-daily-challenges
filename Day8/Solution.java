/* 
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1

*/

class Solution {
  public int strStr(String haystack, String needle) {

    int ind = haystack.indexOf(needle);
    System.out.println(ind);
    if (ind < 0)
      return -1;
    return ind;
  }
}