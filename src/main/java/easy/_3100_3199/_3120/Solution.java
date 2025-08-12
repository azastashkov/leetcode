package easy._3100_3199._3120;

public class Solution {
    public int numberOfSpecialChars(String word) {
        int l = word.length();
        int[] lowercase = new int[26];
        int[] uppercase = new int[26];
        boolean[] found = new boolean[26];
        int count = 0;
        for (int i = 0; i < l; i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercase[c - 'A']++;
                if (lowercase[c - 'a' + 32] > 0 && !found[c - 'A']) {
                    count++;
                    found[c - 'A'] = true;
                }
            } else {
                lowercase[c - 'a']++;
                if (uppercase[c - 'A' - 32] > 0 && !found[c - 'a']) {
                    count++;
                    found[c - 'a'] = true;
                }
            }
        }

        return count;
    }
}