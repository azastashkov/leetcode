package easy._0800_0899._0824;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        String[] words = sentence.split("\\W+");

        StringBuilder sb = new StringBuilder();
        int wc = 1;
        for (String w : words) {
            char c = w.charAt(0);
            if (vowels.contains(c)) {
                sb.append(w).append("ma");
            } else {
                sb.append(w.substring(1)).append(c).append("ma");
            }

            for (int i = 0; i < wc; i++) {
                sb.append('a');
            }
            sb.append(' ');

            wc++;
        }

        sb.setLength(sb.length() - 1);

        return sb.toString();
    }
}
