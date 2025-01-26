package easy._0300_0399._0383;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = new char[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            chars[c - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (chars[c - 'a'] < 1) {
                return false;
            } else {
                chars[c - 'a']--;
            }
        }

        return true;
    }
}
