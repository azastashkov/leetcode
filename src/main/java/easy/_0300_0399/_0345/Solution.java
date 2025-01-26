package easy._0300_0399._0345;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] chars = s.toCharArray();
        boolean lf = false, rf = false;

        int i = 0, j = chars.length - 1;
        while (i < j) {
            if (!lf && !vowels.contains(chars[i])) {
                i++;
            } else {
                lf = true;
            }

            if (!rf && !vowels.contains(chars[j])) {
                j--;
            } else {
                rf = true;
            }

            if (lf && rf) {
                char t = chars[i];
                chars[i] = chars[j];
                chars[j] = t;
                i++;
                j--;
                lf = false;
                rf = false;
            }
        }

        return new String(chars);
    }
}
