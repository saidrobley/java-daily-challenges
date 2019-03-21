import java.util.*;

/*
Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/
public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> groupAnagrams = new ArrayList<>();
    HashMap<String, List<String>> map = new HashMap<>();
    for (String curr : strs) {
      char[] characters = curr.toCharArray();
      Arrays.sort(characters);
      String sorted = new String(characters);
      if (!map.containsKey(sorted)) {
        map.put(sorted, new ArrayList<String>());
      }
      map.get(sorted).add(curr);
    }

    groupAnagrams.addAll(map.values());
    return groupAnagrams;
  }
}