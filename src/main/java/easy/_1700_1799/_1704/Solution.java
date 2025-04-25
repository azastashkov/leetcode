package easy._1700_1799._1704;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean halvesAreAlike(String s) {
        int l = s.length();
        int h = l / 2;

        String a = s.substring(0, h);
        String b = s.substring(h);

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int countA = 0, countB = 0;
        for (int i = 0; i < h; i++) {
            if (vowels.contains(a.charAt(i))) {
                countA++;
            }
            if (vowels.contains(b.charAt(i))) {
                countB++;
            }
        }

        return countA == countB;
    }
}