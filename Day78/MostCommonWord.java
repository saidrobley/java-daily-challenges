import java.util.HashMap;
import java.util.HashSet;

/* 
Given a paragraph and a list of banned words, return the most 
frequent word that is not in the list of banned words.  
It is guaranteed there is at least one word that isn't banned, 
and that the answer is unique.
*/
public class MostCommonWord {
  public String mostCommonWord(String paragraph, String[] banned) {
    HashSet<String> bannedWords = new HashSet<>();
    for (String word : banned) {
      bannedWords.add(word);
    }
    HashMap<String, Integer> map = new HashMap<>();
    for (String word : paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")) {
      if (!bannedWords.contains(word)) {
        map.put(word, map.getOrDefault(word, 0) + 1);
      }
    }
    String res = "";
    int max = Integer.MIN_VALUE;

    for (String key : map.keySet()) {
      if (res.equals("") || map.get(key) > map.get(res)) {
        res = key;
      }

    }
    return res;
  }
}