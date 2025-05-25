package easy._2300_2399._2325;

import java.util.Arrays;

public class Solution {
    public String decodeMessage(String key, String message) {
        int[] k = new int[26];
        Arrays.fill(k, -1);

        int i = 0, j = i;
        while (i < 26) {
            char c = key.charAt(j);
            if (c != ' ') {
                if (k[c - 'a'] < 0) {
                    k[c - 'a'] = i++;
                }
            }
            j++;
        }

        StringBuilder sb = new StringBuilder();
        int l = message.length();
        for (i = 0; i < l; i++) {
            char c = message.charAt(i);
            if (c != ' ') {
                int order = k[c - 'a'];
                char subst = (char) ('a' + order);
                sb.append(subst);
            } else {
                sb.append(' ');
            }
        }

        return sb.toString();
    }
}