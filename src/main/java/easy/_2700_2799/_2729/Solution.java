package easy._2700_2799._2729;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isFascinating(int n) {
        int n2 = n * 2;
        int n3 = n * 3;
        String s = n + "" + n2 + "" + n3;

        int l = s.length();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            set.add(c);
        }

        return set.size() == 9;
    }
}