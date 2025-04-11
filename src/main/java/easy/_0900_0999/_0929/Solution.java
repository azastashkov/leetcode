package easy._0900_0999._0929;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        int l = emails.length;
        Set<String> uniq = new HashSet<>();
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            int k = email.length();
            int i = 0;
            boolean domain = false;
            while (i < k) {
                char c = email.charAt(i);
                if (c == '.' && !domain) {
                    i++;
                    continue;
                }

                if (c == '+' && !domain) {
                    i++;
                    while (i < k && email.charAt(i) != '@') {
                        i++;
                    }
                    continue;
                }

                if (c == '@') {
                    domain = true;
                }

                sb.append(c);
                i++;
            }

            uniq.add(sb.toString());
        }

        return uniq.size();
    }
}