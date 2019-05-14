import java.util.HashMap;

/* 
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/
public class RansomNote {
  public boolean canConstruct(String ransomNote, String magazine) {

    HashMap<Character, Integer> magMap = new HashMap<>();
    for (char c : magazine.toCharArray()) {
      magMap.put(c, magMap.getOrDefault(c, 0) + 1);
    }

    for (char c : ransomNote.toCharArray()) {
      if (!magMap.containsKey(c) || magMap.get(c) <= 0) {
        return false;
      }
      magMap.put(c, magMap.get(c) - 1);
    }
    return true;

  }
}