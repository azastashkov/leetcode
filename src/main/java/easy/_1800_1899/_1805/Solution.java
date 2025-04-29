package easy._1800_1899._1805;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        int l = word.length(), i = 0;
        while (i < l) {
            char c = word.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                int j = i + 1;
                while (j < l) {
                    char p = word.charAt(j);
                    if (!Character.isDigit(p)) {
                        break;
                    }
                    int k = p - '0';
                    sb.append(k);
                    j++;
                }
                i = j;
                set.add(sb.toString().replaceFirst("^0+(?!$)", ""));
            }
            i++;
        }

        return set.size();
    }
}