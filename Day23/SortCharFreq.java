import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;

/* 
Given a string, sort it in decreasing order based on the frequency of characters.
*/
public class SortCharFreq {
  public String frequencySort(String s) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);

    }
    StringBuilder res = new StringBuilder();
    PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
    maxHeap.addAll(map.keySet());
    while (!maxHeap.isEmpty()) {
      char current = maxHeap.remove();
      for (int i = 0; i < map.get(current); i++) {
        res.append(current);
      }
    }
    return res.toString();
  }

}