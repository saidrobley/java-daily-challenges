import java.util.HashSet;

/* 
Given a list of emails, we send one email to each address in the list. 
How many different addresses actually receive mails? 
*/
public class UniqueEmail {
  public int numUniqueEmails(String[] emails) {
    HashSet<String> set = new HashSet<>();
    for (String email : emails) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < email.length(); i++) {
        char c = email.charAt(i);
        if (c == '.') {
          continue;
        } else if (c == '+') {
          while (email.charAt(i) != '@') {
            i++;
          }
          sb.append(email.substring(i + 1));
        } else {
          sb.append(c);
        }

      }
      set.add(sb.toString());
    }
    return set.size();

  }
}