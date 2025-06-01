package easy._2300_2399._2351;

public class Solution {
    public char repeatedCharacter(String s) {
        char[] letters = new char[26];
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            letters[c - 'a']++;
            if (letters[c - 'a'] > 1) {
                return c;
            }
        }

        return 'a';
    }
}