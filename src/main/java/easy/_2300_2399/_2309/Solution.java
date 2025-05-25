package easy._2300_2399._2309;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            set.add(c);
        }

        for (char c = 'Z'; c >= 'A'; c--) {
            if (set.contains(c) && set.contains((char) (c + 32))) {
                return String.valueOf(c);
            }
        }

        return "";
    }
}