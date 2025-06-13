package easy._2500_2599._2506;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int similarPairs(String[] words) {
        int l = words.length, count = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (isSimilar(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isSimilar(String s1, String s2) {
        if (s1 == null) {
            s1 = "";
        }
        if (s2 == null) {
            s2 = "";
        }

        Set<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }

        Set<Character> set2 = new HashSet<>();
        for (char c : s2.toCharArray()) {
            set2.add(c);
        }

        return set1.equals(set2);
    }
}