package easy._1000_1099._1002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> commonChars(String[] words) {
        int m = 'z' - 'a' + 1;
        int[] count = new int[m];
        Arrays.fill(count, 20000);

        for (String w : words) {
            int l = w.length();
            int[] t = new int[m];
            for (int i = 0; i < l; i++) {
                char c = w.charAt(i);
                t[c - 'a']++;
            }
            for (int i = 0; i < m; i++) {
                count[i] = Math.min(count[i], t[i]);
            }
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.addAll(Collections.nCopies(count[i], Character.toString('a' + i)));
        }

        return list;
    }
}