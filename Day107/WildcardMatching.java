/* 
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*'.

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
*/
public class WildcardMatching {
  public boolean isMatch(String s, String p) {
    int sp = 0;
    int pp = 0;
    int star = -1;
    int match = 0;

    while (sp < s.length()) {
      if (pp < p.length() && (p.charAt(pp) == s.charAt(sp) || p.charAt(pp) == '?')) {
        sp++;
        pp++;
      } else if (pp < p.length() && p.charAt(pp) == '*') {
        star = pp;
        match = sp;
        pp++;
      } else if (star != -1) {
        pp = star + 1;
        match += 1;
        sp = match;
      } else {
        return false;
      }
    }
    while (pp < p.length() && p.charAt(pp) == '*') {
      pp++;
    }
    return pp == p.length();
  }
}