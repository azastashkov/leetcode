package easy._2500_2599._2586;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isVowelString(words[i])) {
                count++;
            }
        }

        return count;
    }

    private boolean isVowelString(String s) {
        int l = s.length();
        char b = s.charAt(0);
        char e = s.charAt(l - 1);

        if (vowels.contains(b) && vowels.contains(e)) {
            return true;
        }

        return false;
    }
}