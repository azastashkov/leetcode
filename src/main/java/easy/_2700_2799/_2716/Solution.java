package easy._2700_2799._2716;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size();
    }
}