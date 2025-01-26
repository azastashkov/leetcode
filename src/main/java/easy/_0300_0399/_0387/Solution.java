package easy._0300_0399._0387;

public class Solution {
    public int firstUniqChar(String s) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cnt[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (cnt[c - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
