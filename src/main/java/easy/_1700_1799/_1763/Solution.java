package easy._1700_1799._1763;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        int k = -1;
        int mx = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; ++j) {
                set.add(s.charAt(j));
                boolean ok = true;
                for (char a : set) {
                    char b = (char) (a ^ 32);
                    if (!(set.contains(a) && set.contains(b))) {
                        ok = false;
                        break;
                    }
                }

                if (ok && mx < j - i + 1) {
                    mx = j - i + 1;
                    k = i;
                }
            }
        }

        return k == -1 ? "" : s.substring(k, k + mx);
    }
}