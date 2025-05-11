package easy._2000_2099._2062;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countVowelSubstrings(String word) {
        int l = word.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < l; ++j) {
                char c = word.charAt(j);
                if (!isVowel(c)) {
                    break;
                }

                set.add(c);
                if (set.size() == 5) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}