package easy._1800_1899._1876;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
    public int countGoodSubstrings(String s) {
        List<String> good = new LinkedList<>();
        int l = s.length();
        for (int i = 0; i < l - 2; i++) {
            Set<Character> set = new HashSet<>();
            char[] chars = new char[3];
            for (int j = i; j < i + 3; j++) {
                char c = s.charAt(j);
                set.add(c);
                chars[j - i] = c;
            }
            if (set.size() == 3) {
                good.add(new String(chars));
            }
        }

        return good.size();
    }
}